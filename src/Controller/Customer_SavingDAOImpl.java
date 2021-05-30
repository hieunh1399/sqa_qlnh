package Controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.CauHinh_Gui;
import Model.Customer_Saving;

public class Customer_SavingDAOImpl implements Customer_SavingDAO {
	static String LIST_CUS = "SELECT * from customer_saving";
	static String GET_CUS_BY_ID = "Select * from customer_saving where Id=?";
	private String SELECT_CUS_LIKE_HD = "Select * from customer_saving where SoHopDongTK Like ?";
	static String LIST_CUS_REPORT ="SELECT * FROM customer_saving WHERE TIMESTAMPDIFF(DAY,CURRENT_TIMESTAMP,NgayHetHan)< 0;";
	
	@Override
	public List<Customer_Saving> lstCusG(){
		List<Customer_Saving> lstCus = new ArrayList<>();
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre = con.prepareStatement(LIST_CUS);
			System.out.println(pre);
			ResultSet rs = pre.executeQuery();
			while(rs.next()){
				int Id = rs.getInt("Id");
				String tenKH = rs.getString("TenKH");
				String soCMT = rs.getString("SoCMT");
				String soHopDongGui= rs.getString("SoHopDongTK");
				int hinhThucTK = rs.getInt("HinhThucTK");
				CauHinh_GuiDAOImpl chgi = new CauHinh_GuiDAOImpl();
				CauHinh_Gui chg = chgi.getCHGById(hinhThucTK);
				Customer_Saving cg = new Customer_Saving(Id,tenKH,soCMT,soHopDongGui,chg);
				lstCus.add(cg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCus;
	}
	
	@Override
	public Customer_Saving getCusSavingById(int id){
		Customer_Saving cs = new Customer_Saving();
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre= con.prepareStatement(GET_CUS_BY_ID);
			System.out.println(pre);
			pre.setInt(1, id);
			ResultSet rs= pre.executeQuery();
			if(rs.next()){
				int Id = rs.getInt("Id");
				String tenKH = rs.getString("TenKH");
				String soCMT = rs.getString("SoCMT");
				String soDienThoai = rs.getString("SoDienThoai");
				String diaChi = rs.getString("DiaChi");
				String email = rs.getString("Email");
				String soHopDongGui= rs.getString("SoHopDongTK");
				int hinhThucTK = rs.getInt("HinhThucTK");
				CauHinh_GuiDAOImpl chvi = new CauHinh_GuiDAOImpl();
				CauHinh_Gui chg = chvi.getCHGById(hinhThucTK);
				float soTien = rs.getFloat("SoTienTK");
				int kyHan = rs.getInt("KyHan");
				Date tuNgay = rs.getDate("NgayPhatHanh");
				Date denNgay = rs.getDate("NgayHetHan");
				cs = new Customer_Saving(Id,tenKH,soCMT,soDienThoai,diaChi,email,soHopDongGui,chg,soTien,kyHan,tuNgay,denNgay);			
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}
	public List<Customer_Saving> lstCusByKey(String key){
		List<Customer_Saving> lstCus = new ArrayList<>();
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre = con.prepareStatement(SELECT_CUS_LIKE_HD);
			System.out.println(pre);
			pre.setString(1,"%"+key+"%");
			ResultSet rs = pre.executeQuery();
            while(rs.next())
            {
            	int Id = rs.getInt("Id");
				String tenKH = rs.getString("TenKH");
				String soCMT = rs.getString("SoCMT");
				String soHopDongVay= rs.getString("SoHopDongTK");
				int hinhThucTK = rs.getInt("HinhThucTK");
				CauHinh_GuiDAOImpl chgi = new CauHinh_GuiDAOImpl();
				CauHinh_Gui chg = chgi.getCHGById(hinhThucTK);
				Customer_Saving cg = new Customer_Saving(Id,tenKH,soCMT,soHopDongVay,chg);
				lstCus.add(cg);
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCus;
	}
	@Override
	public List<Customer_Saving> lstCusGReport(){
		List<Customer_Saving> lstCus = new ArrayList<>();
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre = con.prepareStatement(LIST_CUS_REPORT);
			System.out.println(pre);
			ResultSet rs = pre.executeQuery();
			while(rs.next()){
				int Id = rs.getInt("Id");
				String tenKH = rs.getString("TenKH");
				String soCMT = rs.getString("SoCMT");
				String soDienThoai = rs.getString("SoDienThoai");
				String diaChi = rs.getString("DiaChi");
				String email = rs.getString("Email");
				String soHopDongGui= rs.getString("SoHopDongTK");
				int hinhThucTK = rs.getInt("HinhThucTK");
				CauHinh_GuiDAOImpl chvi = new CauHinh_GuiDAOImpl();
				CauHinh_Gui chg = chvi.getCHGById(hinhThucTK);
				float soTien = rs.getFloat("SoTienTK");
				int kyHan = rs.getInt("KyHan");
				Date tuNgay = rs.getDate("NgayPhatHanh");
				Date denNgay = rs.getDate("NgayHetHan");
				Customer_Saving cg = new Customer_Saving(Id,tenKH,soCMT,soDienThoai,diaChi,email,soHopDongGui,chg,soTien,kyHan,tuNgay,denNgay);
				lstCus.add(cg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCus;
	}
	
}
