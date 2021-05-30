package Controller;

import java.util.List;

import Model.Customer_Loan;

public interface Customer_LoanDAO {
	public List<Customer_Loan> lstCus();
	public List<Customer_Loan> lstCusByKey(String key);
	public Customer_Loan getCusLoanById(int id);
	public List<Customer_Loan> lstCusReport();
}
