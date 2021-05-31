package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.CauHinh_Vay;

public class CauHinh_VayDAOImpl implements CauHinh_VayDAO {
	static String GET_CHV_BY_ID = "SELECT * FROM cauhinh_vay where Id =?";
	static String LIST_CHV = "SELECT * from cauhinh_vay";
	static String UPDATE_CHV = "Update cauhinh_vay set SoTienVayToiDa=?, ThoiHanVayToiDa=?, LaiSuat=? where Id=? ";
	private String SELECT_CUS_LIKE_HT = "Select * from cauhinh_vay where HinhThucVay Like ?";

	public List<CauHinh_Vay> lstCHV() {
		List<CauHinh_Vay> lstCHV = new ArrayList<>();
		Connection con = Connect_DB.connection();	
		try {
			PreparedStatement pre = con.prepareStatement(LIST_CHV);
			System.out.println(pre);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				int Id = rs.getInt("Id");
				String hinhThuc = rs.getString("HinhThucVay");
				float soTien = rs.getFloat("SoTienVayToiDa");
				int thoiHan = rs.getInt("ThoiHanVayToiDa");
				float laiSuat = rs.getFloat("LaiSuat");
				CauHinh_Vay chv = new CauHinh_Vay(Id, hinhThuc, soTien, thoiHan, laiSuat);
				lstCHV.add(chv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstCHV;

	}

	public CauHinh_Vay getCHVById(int id) {
		CauHinh_Vay chv = null;
		Connection con = Connect_DB.connection();

		try {
			PreparedStatement pre = con.prepareStatement(GET_CHV_BY_ID);
			pre.setInt(1, id);
			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				int Id = rs.getInt("Id");
				String hinhThucVay = rs.getString("HinhThucVay");
				float soTienToiDa = rs.getFloat("SoTienVayToiDa");
				int thoiHan = rs.getInt("ThoiHanVayToiDa");
				float laiSuat = rs.getFloat("LaiSuat");
				String soTienPhaiTra = rs.getString("SoTienPhaiTraLai");
				String tongTien = rs.getString("TongSoTienPhaiTra");
				String donVi = rs.getString("DonViTienTe");
				chv = new CauHinh_Vay(Id, hinhThucVay, soTienToiDa, thoiHan, laiSuat, soTienPhaiTra, tongTien, donVi);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chv;
	}

	public void updateCHV(CauHinh_Vay cauHinhVay) throws SQLException {
		Connection con = Connect_DB.connection();
		PreparedStatement pre;
		try {
			pre = con.prepareStatement(UPDATE_CHV);
			pre.setFloat(1, cauHinhVay.getSoTienToiDa());
			pre.setInt(2, cauHinhVay.getThoiHan());
			pre.setFloat(3, cauHinhVay.getLaiSuat());
			pre.setInt(4, cauHinhVay.getId());
			
			System.out.println(pre);
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<CauHinh_Vay> searchCHV(String key){
		List<CauHinh_Vay> lstCHV = new ArrayList<>();
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre = con.prepareStatement(SELECT_CUS_LIKE_HT);
			System.out.println(pre);
			pre.setString(1,"%"+key+"%");
			ResultSet rs = pre.executeQuery();
            while(rs.next())
            {
            	int Id = rs.getInt("Id");
				String hinhThuc = rs.getString("HinhThucVay");
				float soTien = rs.getFloat("SoTienVayToiDa");
				int thoiHan = rs.getInt("ThoiHanVayToiDa");
				float laiSuat = rs.getFloat("LaiSuat");
				CauHinh_Vay chv = new CauHinh_Vay(Id, hinhThuc, soTien, thoiHan, laiSuat);
				lstCHV.add(chv);
				
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCHV;
	}

}
