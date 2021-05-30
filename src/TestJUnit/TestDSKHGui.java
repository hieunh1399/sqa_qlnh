package TestJUnit;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

import Controller.Customer_SavingDAOImpl;
import Model.Customer_Saving;

public class TestDSKHGui extends Customer_SavingDAOImpl {
	@Test
	public void testDSKH() {
		Customer_SavingDAOImpl customer_SavingDAO = new Customer_SavingDAOImpl();
		try {
			List<Customer_Saving> listCus = customer_SavingDAO.lstCusG();
			for(Customer_Saving cus:listCus) {
				if(cus.getId()==1) {
					assertTrue(cus.getTenKH().equals("Nguyen Huong Giang"));
					assertTrue(cus.getSoCMT().equals("12345"));
					assertTrue(cus.getSoHD().equals("GTK001"));
					assertTrue(cus.getCauhinhgui().getHinhThucGui().equals("Co ky han"));	
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void chiTietKH() {
		Customer_SavingDAOImpl customer_SavingDAO = new Customer_SavingDAOImpl();
		try {
			Customer_Saving cus = customer_SavingDAO.getCusSavingById(1);	
				if(cus.getId()==1) {
					assertTrue(cus.getTenKH().equals("Nguyen Huong Giang"));
					assertTrue(cus.getSoCMT().equals("12345"));
					assertTrue(cus.getSdt().equals("012345"));
					assertTrue(cus.getDiaChi().equals("Hai Duong"));
					assertTrue(cus.getEmail().equals("Giang@gmail.com"));
					assertTrue(cus.getSoHD().equals("GTK001"));
					assertTrue(cus.getCauhinhgui().getHinhThucGui().equals("Co ky han"));	
					assertTrue(cus.getSoTien()==50000000);
					assertTrue(cus.getKyHan()==12);
					assertTrue(cus.getTuNgay().toString().equals("2021-04-02"));
					assertTrue(cus.getDenNgay().toString().equals("2022-04-02"));
				}			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	Test tìm kiếm khách hàng
	@Test
	public void testTimKiem() {
		Customer_SavingDAOImpl customer_SavingDAO = new Customer_SavingDAOImpl();
		try {
			List<Customer_Saving> listCus = customer_SavingDAO.lstCusByKey("GTK001");
			for(Customer_Saving cus:listCus) {
					assertTrue(cus.getTenKH().equals("Nguyen Huong Giang"));
					assertTrue(cus.getSoCMT().equals("12345"));
					assertTrue(cus.getSoHD().equals("GTK001"));
					assertTrue(cus.getCauhinhgui().getHinhThucGui().equals("Co ky han"));	
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
