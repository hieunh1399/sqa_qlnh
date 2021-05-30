package TestJUnit;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import Controller.CauHinh_GuiDAOImpl;
import Model.CauHinh_Gui;

public class TestCHG extends CauHinh_GuiDAOImpl{
	@Test
	public void testCHG() {
		CauHinh_GuiDAOImpl cauHinh_guiDAO = new CauHinh_GuiDAOImpl();
		try {
			List<CauHinh_Gui> listCHG = cauHinh_guiDAO.lstCHG();
			for(CauHinh_Gui chv:listCHG) {
				if(chv.getId()==1) {
					assertTrue(chv.getHinhThucGui().equals("Co ky han"));
					assertTrue(chv.getSoTienGui()==1000000);
					assertTrue(chv.getKyHan()==6);
					assertTrue(chv.getLaiSuat().toString().equals("0.005"));
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
