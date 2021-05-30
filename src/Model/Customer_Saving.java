package Model;

import java.io.Serializable;
import java.util.Date;

public class Customer_Saving implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4185161063511443912L;
	private int id;
	private String tenKH;
	private String soCMT;
	private String sdt;
	private String diaChi;
	private String email;
	private String soHD;
	private Float soTien;
	private int kyHan;
	private Date tuNgay;
	private Date denNgay;
	private CauHinh_Gui cauhinhgui;
	
	public Customer_Saving(int id, String tenKH, String soCMT, String sdt, String diaChi, String email, String soHD,
			CauHinh_Gui cauhinhgui,Float soTien, int kyHan, Date tuNgay, Date denNgay) {
		super();
		this.id = id;
		this.tenKH = tenKH;
		this.soCMT = soCMT;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.email = email;
		this.soHD = soHD;
		this.soTien = soTien;
		this.kyHan = kyHan;
		this.tuNgay = tuNgay;
		this.denNgay = denNgay;
		this.cauhinhgui=cauhinhgui;
	}
	public Customer_Saving(int id, String tenKH, String soCMT,String soHD,CauHinh_Gui cauHinh_Gui) {
		super();
		this.id = id;
		this.tenKH = tenKH;
		this.soCMT = soCMT;
		this.soHD = soHD;	
		this.cauhinhgui=cauHinh_Gui;
	}
	public CauHinh_Gui getCauhinhgui() {
		return cauhinhgui;
	}
	public void setCauhinhgui(CauHinh_Gui cauhinhgui) {
		this.cauhinhgui = cauhinhgui;
	}
	public Customer_Saving(){
		
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
	public String getSoHD() {
		return soHD;
	}
	public void setSoHD(String soHD) {
		this.soHD = soHD;
	}
	public Float getSoTien() {
		return soTien;
	}
	public void setSoTien(Float soTien) {
		this.soTien = soTien;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
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
	
}
