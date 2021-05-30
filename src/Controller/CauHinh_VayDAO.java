package Controller;

import java.sql.SQLException;
import java.util.List;

import Model.CauHinh_Vay;

public interface CauHinh_VayDAO {
	public List<CauHinh_Vay> lstCHV();
	public CauHinh_Vay getCHVById(int id);
	public void updateCHV (CauHinh_Vay cauHinhVay) throws SQLException;
}
