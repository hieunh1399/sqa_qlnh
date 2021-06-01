package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Account;


public class AccountDAOImpl implements AccountDAO {
	private final static String CHECK_LOGIN_SQL="SELECT * FROM Account WHERE username=? AND password=?";
	@Override
	public boolean checkLogin(Account acc) {
		boolean isvalid=false;
		Connection con = Connect_DB.connection();
		try {
			PreparedStatement pre = con.prepareStatement(CHECK_LOGIN_SQL);
			pre.setString(1, acc.getUsername());
			pre.setString(2, acc.getPassword());
			
			ResultSet rs = pre.executeQuery();
			if(rs.next())
			{
				isvalid=true;
			}else {
				isvalid=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isvalid;
	}
}
