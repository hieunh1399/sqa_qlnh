package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;



import Model.CauHinh_Vay;
import Model.Customer_Loan;

public class Customer_LoanDAOImpl implements Customer_LoanDAO{
	static String LIST_CUS = "SELECT * from customer_loan";
	static String GET_CUS_BY_ID = "Select * from customer_loan where Id=?";
	private String SELECT_CUS_LIKE_HD = "Select * from customer_loan where SoHopDongVay Like ?";
	static String LIST_CUS_REPORT ="SELECT * FROM customer_loan WHERE TIMESTAMPDIFF(DAY,CURRENT_TIMESTAMP,DenNgay)< 0";
	
	@Override
	public List<Customer_Loan> lstCus(){
		List<Customer_Loan> lstCus = new ArrayList<>();
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre = con.prepareStatement(LIST_CUS);
			System.out.println(pre);
			ResultSet rs = pre.executeQuery();
			while(rs.next()){
				int Id = rs.getInt("Id");
				String tenKH = rs.getString("TenKH");
				String soCMT = rs.getString("SoCMT");
				String soDienThoai = rs.getString("SoDienThoai");
				String diaChi = rs.getString("DiaChi");
				String email = rs.getString("Email");
				String soHopDongVay= rs.getString("SoHopDongVay");
				int hinhThucVay = rs.getInt("HinhThucVay");
				CauHinh_VayDAOImpl chvi = new CauHinh_VayDAOImpl();
				CauHinh_Vay chv = chvi.getCHVById(hinhThucVay);
				float soTien = rs.getFloat("SoTienVayNo");
				int kyHan = rs.getInt("KyHan");
				Date tuNgay = rs.getDate("TuNgay");
				Date denNgay = rs.getDate("DenNgay");
				Customer_Loan cl = new Customer_Loan(Id,tenKH,soCMT,soDienThoai,diaChi,email,soHopDongVay,chv,soTien,kyHan,tuNgay,denNgay);
				lstCus.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCus;
	}
	
	@Override
	public Customer_Loan getCusLoanById(int id){
		Customer_Loan cl = new Customer_Loan();
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
				String soHopDongVay= rs.getString("SoHopDongVay");
				int hinhThucVay = rs.getInt("HinhThucVay");
				CauHinh_VayDAOImpl chvi = new CauHinh_VayDAOImpl();
				CauHinh_Vay chv = chvi.getCHVById(hinhThucVay);
				float soTien = rs.getFloat("SoTienVayNo");
				int kyHan = rs.getInt("KyHan");
				Date tuNgay = rs.getDate("TuNgay");
				Date denNgay = rs.getDate("DenNgay");
				cl = new Customer_Loan(Id,tenKH,soCMT,soDienThoai,diaChi,email,soHopDongVay,chv,soTien,kyHan,tuNgay,denNgay);			
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}
	public List<Customer_Loan> lstCusByKey(String key){
		List<Customer_Loan> lstCus = new ArrayList<>();
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
				String soHopDongVay= rs.getString("SoHopDongVay");
				int hinhThucVay = rs.getInt("HinhThucVay");
				CauHinh_VayDAOImpl chvi = new CauHinh_VayDAOImpl();
				CauHinh_Vay chv = chvi.getCHVById(hinhThucVay);
				Customer_Loan cl = new Customer_Loan(Id,tenKH,soCMT,soHopDongVay,chv);
				lstCus.add(cl);
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCus;
	}

	@Override
	public List<Customer_Loan> lstCusReport() {
		List<Customer_Loan> lstCus = new ArrayList<>();
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
				String soHopDongVay= rs.getString("SoHopDongVay");
				int hinhThucVay = rs.getInt("HinhThucVay");
				CauHinh_VayDAOImpl chvi = new CauHinh_VayDAOImpl();
				CauHinh_Vay chv = chvi.getCHVById(hinhThucVay);
				float soTien = rs.getFloat("SoTienVayNo");
				int kyHan = rs.getInt("KyHan");
				Date tuNgay = rs.getDate("TuNgay");
				Date denNgay = rs.getDate("DenNgay");
				Customer_Loan cl = new Customer_Loan(Id,tenKH,soCMT,soDienThoai,diaChi,email,soHopDongVay,chv,soTien,kyHan,tuNgay,denNgay);
				lstCus.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstCus;
	}
	
}
