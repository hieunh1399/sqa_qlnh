package TestJUnit;

import org.junit.Test;


import Controller.Customer_LoanDAOImpl;
import Model.Customer_Loan;
import static org.junit.Assert.*;
import java.util.List;

public class TestDSKHVay extends Customer_LoanDAOImpl{
	//Test xuất danh sách khách hàng
	@Test
	public void testDSKH() {
		Customer_LoanDAOImpl customer_LoanDAO = new Customer_LoanDAOImpl();
		try {
			List<Customer_Loan> listCus = customer_LoanDAO.lstCus();
			for(Customer_Loan cus:listCus) {
				if(cus.getId()==1) {
					assertTrue(cus.getTenKH().equals("Nguyen Huy Dong"));
					assertTrue(cus.getSoCMT().equals("0123456"));
					assertTrue(cus.getSoHD().equals("NHD123"));
					assertTrue(cus.getCauhinhvay().getHinhThucVay().equals("Vay kinh doanh"));	
				}
				if(cus.getId()==2) {
					assertTrue(cus.getTenKH().equals("Bach Duy Hieu"));
					assertTrue(cus.getSoCMT().equals("0345"));
					assertTrue(cus.getSoHD().equals("BDH345"));
					assertTrue(cus.getCauhinhvay().getHinhThucVay().equals("Vay mua nha"));	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Test lấy chi tiết 1 khách hàng
	@Test
	public void chiTietKH() {
		Customer_LoanDAOImpl customer_LoanDAO = new Customer_LoanDAOImpl();
		try {
			Customer_Loan cus = customer_LoanDAO.getCusLoanById(1);	
				if(cus.getId()==1) {
					assertTrue(cus.getTenKH().equals("Nguyen Huy Dong"));
					assertTrue(cus.getSoCMT().equals("0123456"));
					assertTrue(cus.getSdt().equals("0986868896"));
					assertTrue(cus.getDiaChi().equals("Xuân Mai.HN"));
					assertTrue(cus.getEmail().equals("dongvjp99@gmail.com"));
					assertTrue(cus.getSoHD().equals("NHD123"));
					assertTrue(cus.getCauhinhvay().getHinhThucVay().equals("Vay kinh doanh"));	
					assertTrue(cus.getSoTienVayNo()==100000000);
					assertTrue(cus.getKyHan()==60);
					assertTrue(cus.getTuNgay().toString().equals("2021-04-01"));
					assertTrue(cus.getDenNgay().toString().equals("2026-04-01"));
				}			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	Test tìm kiếm khách hàng
	@Test
	public void testTimKiem() {
		Customer_LoanDAOImpl customer_LoanDAO = new Customer_LoanDAOImpl();
		try {
			List<Customer_Loan> listCus = customer_LoanDAO.lstCusByKey("NHD123");
			for(Customer_Loan cus:listCus) {			
					assertTrue(cus.getTenKH().equals("Nguyen Huy Dong"));
					assertTrue(cus.getSoCMT().equals("0123456"));
					assertTrue(cus.getSoHD().equals("NHD123"));
					assertTrue(cus.getCauhinhvay().getHinhThucVay().equals("Vay kinh doanh"));	
		
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
	
	
