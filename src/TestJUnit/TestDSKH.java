package TestJUnit;

import org.junit.Test;


import Controller.Customer_LoanDAOImpl;
import Controller.Customer_SavingDAOImpl;
import Model.Customer_Loan;
import Model.Customer_Saving;

import static org.junit.Assert.*;
import java.util.List;


public class TestDSKH extends Customer_LoanDAOImpl{
	Customer_LoanDAOImpl customer_LoanDAO = new Customer_LoanDAOImpl();
	Customer_SavingDAOImpl customer_SavingDAO = new Customer_SavingDAOImpl();
	
	//Test xuất danh sách khách hàng vay nợ
	@Test
	public void testDSKHV() {		
			List<Customer_Loan> listCus = customer_LoanDAO.lstCus();
			assertNotNull(listCus);
			assertTrue(true);	
	}
	
	
//	Test tìm kiếm khách hàng gửi TK
	@Test
	public void testTimKiemKHV() {		
		String key ="NHD123";
		List<Customer_Loan> listCus = customer_LoanDAO.lstCusByKey(key);
		assertNotNull(listCus);
		assertEquals(1,listCus.size());
		for(int i=0;i < lstCusByKey(key).size();i++) {
			assertTrue(lstCusByKey(key).get(i).getSoHD().toLowerCase().contains(key.toLowerCase()));
		}
		return;
	}	
	
	//Test tim kiem KH vay nợ fail
	@Test
	public void testTimKiemKHVException() {		
		String key ="Nguyen Huy Dong";
		List<Customer_Loan> listCus = customer_LoanDAO.lstCusByKey(key);
		assertNotNull(listCus);
		assertEquals(0,listCus.size());
		return;
	}
	
	//Test xuất danh sách khách hàng vay nợ
		@Test
		public void testDSKHG() {		
				List<Customer_Saving> listCus = customer_SavingDAO.lstCusG();
				assertNotNull(listCus);
				assertTrue(true);	
		}
		
		
//		Test tìm kiếm khách hàng gửi
		@Test
		public void testTimKiemKHG() {		
			String key ="NHH003";
			List<Customer_Saving> listCus = customer_SavingDAO.lstCusByKey(key);
			assertNotNull(listCus);
			assertEquals(1,listCus.size());
			for(int i=0;i < lstCusByKey(key).size();i++) {
				assertTrue(lstCusByKey(key).get(i).getSoHD().toLowerCase().contains(key.toLowerCase()));
			}
			return;
		}	
		
		//Test tim kiem KH gửi fail
		@Test
		public void testTimKiemKHGException() {		
			String key ="Nguyen Huy Hoang";
			List<Customer_Saving> listCus = customer_SavingDAO.lstCusByKey(key);
			assertNotNull(listCus);
			assertEquals(0,listCus.size());
			return;
		}
	
}
	
	
