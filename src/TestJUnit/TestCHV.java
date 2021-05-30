package TestJUnit;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

import Controller.CauHinh_VayDAOImpl;
import Model.CauHinh_Vay;
public class TestCHV extends CauHinh_VayDAOImpl{
	@Test
	public void testCHV() {
		CauHinh_VayDAOImpl cauHinh_LoanDAO = new CauHinh_VayDAOImpl();
		try {
			List<CauHinh_Vay> listCHV = cauHinh_LoanDAO.lstCHV();
			for(CauHinh_Vay chv:listCHV) {
				if(chv.getId()==1) {
					assertTrue(chv.getHinhThucVay().equals("Vay kinh doanh"));
					assertTrue(chv.getThoiHan()==84);
					assertTrue(chv.getLaiSuat().toString().equals("0.006"));
				}
				if(chv.getId()==2) {
					assertTrue(chv.getHinhThucVay().equals("Vay mua nha"));			
					assertTrue(chv.getThoiHan()==60);
					assertTrue(chv.getLaiSuat().toString().equals("0.006"));
			}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
