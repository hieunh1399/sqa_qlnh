package Model;

import java.io.Serializable;

public class CauHinh_Vay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1582776298997594858L;
	private int id;
	private String hinhThucVay;
	private float soTienToiDa;
	private int thoiHan;
	private float laiSuat;
	private String soTienPhaiTra;
	private String tong;
	private String donVi;
	
	public CauHinh_Vay(int id,String hinhThucVay, float soTienToiDa, int thoiHan, float laiSuat, String soTienPhaiTra,
			String tong, String donVi) {
		super();
		this.id=id;
		this.hinhThucVay = hinhThucVay;
		this.soTienToiDa = soTienToiDa;
		this.thoiHan = thoiHan;
		this.laiSuat = laiSuat;
		this.soTienPhaiTra = soTienPhaiTra;
		this.tong = tong;
		this.donVi = donVi;
	}
	public CauHinh_Vay(int id,String hinhThucVay, Float soTienToiDa, int thoiHan, Float laiSuat) {
		super();
		this.id=id;
		this.hinhThucVay = hinhThucVay;
		this.soTienToiDa = soTienToiDa;
		this.thoiHan = thoiHan;
		this.laiSuat = laiSuat;
	}
	public CauHinh_Vay(String hinhThucVay, float soTienToiDa, int thoiHan, float laiSuat, String soTienPhaiTra,
			String tong, String donVi) {
		super();
		this.hinhThucVay = hinhThucVay;
		this.soTienToiDa = soTienToiDa;
		this.thoiHan = thoiHan;
		this.laiSuat = laiSuat;
		this.soTienPhaiTra = soTienPhaiTra;
		this.tong = tong;
		this.donVi = donVi;
	}
	public CauHinh_Vay(int id,Float soTienToiDa, int thoiHan, Float laiSuat) {
		super();
		this.id=id;
		this.soTienToiDa = soTienToiDa;
		this.thoiHan = thoiHan;
		this.laiSuat = laiSuat;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHinhThucVay() {
		return hinhThucVay;
	}
	public void setHinhThucVay(String hinhThucVay) {
		this.hinhThucVay = hinhThucVay;
	}
	public Float getSoTienToiDa() {
		return soTienToiDa;
	}
	public void setSoTienToiDa(Float soTienToiDa) {
		this.soTienToiDa = soTienToiDa;
	}
	public int getThoiHan() {
		return thoiHan;
	}
	public void setThoiHan(int thoiHan) {
		this.thoiHan = thoiHan;
	}
	public Float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(Float laiSuat) {
		this.laiSuat = laiSuat;
	}
	public String getSoTienPhaiTra() {
		return soTienPhaiTra;
	}
	public void setSoTienPhaiTra(String soTienPhaiTra) {
		this.soTienPhaiTra = soTienPhaiTra;
	}
	public String getTong() {
		return tong;
	}
	public void setTong(String tong) {
		this.tong = tong;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	
}
