package Controller;

import java.util.List;
import Model.Customer_Saving;

public interface Customer_SavingDAO {
	public List<Customer_Saving> lstCusG();
	public List<Customer_Saving> lstCusByKey(String key);
	public Customer_Saving getCusSavingById(int id);
	public List<Customer_Saving> lstCusGReport();
}
