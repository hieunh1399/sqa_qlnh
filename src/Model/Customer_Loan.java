package Model;

import java.io.Serializable;
import java.util.Date;

public class Customer_Loan implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7105112058973810033L;
	private int id;
	private String tenKH;
	private String soCMT;
	private String sdt;
	private String diaChi;
	private String email;
	private String soHD;
	private Float soTienVayNo;
	private int kyHan;
	private Date tuNgay;
	private Date denNgay;
	private CauHinh_Vay cauhinhvay;
	
	public Customer_Loan(int id, String tenKH, String soCMT, String sdt, String diaChi, String email, String soHD, CauHinh_Vay cauhinhvay,
			Float soTienVayNo, int kyHan, Date tuNgay, Date denNgay) {
		super();
		this.id = id;
		this.tenKH = tenKH;
		this.soCMT = soCMT;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.email = email;
		this.soHD = soHD;
		this.cauhinhvay = cauhinhvay;
		this.soTienVayNo = soTienVayNo;
		this.kyHan = kyHan;
		this.tuNgay = tuNgay;
		this.denNgay = denNgay;
	}
	public Customer_Loan(int id, String tenKH, String soCMT,String soHD, CauHinh_Vay cauhinhvay) {
		super();
		this.id = id;
		this.tenKH = tenKH;
		this.soCMT = soCMT;
		this.soHD = soHD;
		this.cauhinhvay = cauhinhvay;
	}
	public Customer_Loan(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getSoCMT() {
		return soCMT;
	}
	public void setSoCMT(String soCMT) {
		this.soCMT = soCMT;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	public String getSoHD() {
		return soHD;
	}
	public void setSoHD(String soHD) {
		this.soHD = soHD;
	}
	public Float getSoTienVayNo() {
		return soTienVayNo;
	}
	public void setSoTienVayNo(Float soTienVayNo) {
		this.soTienVayNo = soTienVayNo;
	}
	public Date getTuNgay() {
		return tuNgay;
	}
	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}
	public Date getDenNgay() {
		return denNgay;
	}
	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}
	public CauHinh_Vay getCauhinhvay() {
		return cauhinhvay;
	}
	public void setCauhinhvay(CauHinh_Vay cauhinhvay) {
		this.cauhinhvay = cauhinhvay;
	}
	
}
