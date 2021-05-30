package Controller;

import java.sql.SQLException;
import java.util.List;

import Model.CauHinh_Gui;

public interface CauHinh_GuiDAO {
	public List<CauHinh_Gui> lstCHG();
	public CauHinh_Gui getCHGById(int id);
	public void updateCHG (CauHinh_Gui cauHinhGui) throws SQLException;
}
