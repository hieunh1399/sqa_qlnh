package Model;

import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1088568403843722456L;
	private int id;
	private String username;
	private String password;
	private String postion;
	
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Account(int id, String username, String password, String postion) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.postion = postion;
	}
	public Account() {
		super();
	}
}
