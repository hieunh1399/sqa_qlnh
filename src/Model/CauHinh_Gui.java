package Model;

import java.io.Serializable;

public class CauHinh_Gui implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 994694422573629334L;
	private int id;
	private String hinhThucGui;
	private float soTienGui;
	private int kyHan;
	private String phuongThuc;
	private Float laiSuat;
	private String soTienLai;
	private String donVi;
	
	
	public CauHinh_Gui(int id,String hinhThucGui, float soTienGui, int kyHan, String phuongThuc, Float laiSuat,
			String soTienLai, String donVi) {
		super();
		this.id= id;
		this.hinhThucGui = hinhThucGui;
		this.soTienGui = soTienGui;
		this.kyHan = kyHan;
		this.phuongThuc = phuongThuc;
		this.laiSuat = laiSuat;
		this.soTienLai = soTienLai;
		this.donVi = donVi;
	}
	public CauHinh_Gui(int id,String hinhThucGui, float soTienGui, int kyHan, Float laiSuat) {
		super();
		this.id= id;
		this.hinhThucGui = hinhThucGui;
		this.soTienGui = soTienGui;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
		
	}
	public CauHinh_Gui(int id,float soTienGui, int kyHan, float laiSuat) {
		super();
		this.id= id;
		this.soTienGui = soTienGui;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHinhThucGui() {
		return hinhThucGui;
	}
	public void setHinhThucGui(String hinhThucGui) {
		this.hinhThucGui = hinhThucGui;
	}
	public float getSoTienGui() {
		return soTienGui;
	}
	public void setSoTienGui(float soTienGui) {
		this.soTienGui = soTienGui;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	public String getPhuongThuc() {
		return phuongThuc;
	}
	public void setPhuongThuc(String phuongThuc) {
		this.phuongThuc = phuongThuc;
	}
	public Float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(Float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public String getSoTienLai() {
		return soTienLai;
	}
	public void setSoTienLai(String soTienLai) {
		this.soTienLai = soTienLai;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	
}
