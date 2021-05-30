package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.CauHinh_Gui;

public class CauHinh_GuiDAOImpl {
	static String GET_CHG_BY_ID = "SELECT * FROM cauhinh_gui where Id =?";
	static String LIST_CHG = "SELECT * from cauhinh_gui";
	static String UPDATE_CHG = "Update cauhinh_gui set SoTienGuiToiThieu = ?, KyHan=?, LaiSuat=? where Id=?";

	public List<CauHinh_Gui> lstCHG() {
		List<CauHinh_Gui> lstCHG = new ArrayList<>();
		Connection con = Connect_DB.connection();	
		try {
			PreparedStatement pre = con.prepareStatement(LIST_CHG);
			System.out.println(pre);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				int Id = rs.getInt("Id");
				String hinhThuc = rs.getString("HinhThucGui");
				float soTien = rs.getFloat("SoTienGuiToiThieu");
				int kyHan = rs.getInt("KyHan");
				float laiSuat = rs.getFloat("LaiSuat");
				CauHinh_Gui chg = new CauHinh_Gui(Id, hinhThuc, soTien, kyHan, laiSuat);
				lstCHG.add(chg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstCHG;

	}

	public CauHinh_Gui getCHGById(int id) {
		CauHinh_Gui chg = null;
		Connection con = Connect_DB.connection();

		try {
			PreparedStatement pre = con.prepareStatement(GET_CHG_BY_ID);
			pre.setInt(1, id);
			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				int Id = rs.getInt("Id");
				String hinhThucGui = rs.getString("HinhThucGui");
				float soTienToiDa = rs.getFloat("SoTienGuiToiThieu");
				int kyHan = rs.getInt("KyHan");
				String phuongThuc = rs.getString("PhuongThucTraLai");
				float laiSuat = rs.getFloat("LaiSuat");
				String soTienLai = rs.getString("SoTienLai");
				String donVi = rs.getString("DonViTienTe");
				chg = new CauHinh_Gui(Id, hinhThucGui, soTienToiDa, kyHan,phuongThuc,laiSuat,soTienLai, donVi);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chg;
	}
	public void updateCHG(CauHinh_Gui cauHinhGui) throws SQLException {
		
		Connection con = Connect_DB.connection();
		PreparedStatement pre;
		try {
			pre = con.prepareStatement(UPDATE_CHG);
			pre.setFloat(1, cauHinhGui.getSoTienGui());
			pre.setInt(2, cauHinhGui.getKyHan());
			pre.setFloat(3, cauHinhGui.getLaiSuat());
			pre.setInt(4, cauHinhGui.getId());
			
			System.out.println(pre);
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
