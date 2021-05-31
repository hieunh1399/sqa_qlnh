package TestJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.util.List;
import org.junit.Test;

import Controller.CauHinh_GuiDAOImpl;
import Controller.CauHinh_VayDAOImpl;
import Controller.Connect_DB;
import Model.CauHinh_Gui;
import Model.CauHinh_Vay;
public class TestCHV extends CauHinh_VayDAOImpl{
	CauHinh_VayDAOImpl cauHinh_LoanDAO = new CauHinh_VayDAOImpl();
	CauHinh_GuiDAOImpl cauHinh_guiDAO = new CauHinh_GuiDAOImpl();
	
	//Test xuất danh sách cấu hình vay
	@Test
	public void testCHV() {
			List<CauHinh_Vay> listCHV = cauHinh_LoanDAO.lstCHV();
			assertNotNull(listCHV);
			assertTrue(true);
	}
	
	//Test update CHV
	@Test
	public void testUpdateCHV() throws Exception {
		Connection con = Connect_DB.connection();
		float newSoTien = 5f;
		int newThoihan = 50;
		float newlaisuat = 4f;
		String key = "Vay kinh doanh";
		con.setAutoCommit(false);
		try {
			
//			List<CauHinh_Vay> lstCHV = cauHinh_LoanDAO.searchCHV(key);
//			
//			lstCHV.get(0).setSoTienToiDa(newSoTien);
//			lstCHV.get(0).setThoiHan(newThoihan);
//			lstCHV.get(0).setLaiSuat(newlaisuat);
//			cauHinh_LoanDAO.updateCHV(lstCHV.get(0));
			
			CauHinh_Vay chv = new CauHinh_Vay(1, newSoTien, newThoihan, newlaisuat);
			cauHinh_LoanDAO.updateCHV(chv);
			
			
			assertEquals(newSoTien, chv.getSoTienToiDa(),0.000001f);
			assertEquals(newThoihan, chv.getThoiHan(),50);
			assertEquals(newlaisuat, chv.getLaiSuat(),0.00001f);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(con!=null) {
				con.rollback();
				con.setAutoCommit(true);
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		return;
	}
	
	//Test xuất danh sách cấu hình gửi
	@Test
	public void testCHG() {
			List<CauHinh_Gui> listCHG = cauHinh_guiDAO.lstCHG();
			assertNotNull(listCHG);
			assertTrue(true);
		}
	
	
}
