package ntu.buithanhphap;

public class SanPham {
	//Thuộc tính
	private String tenSp;
	private double donGia;
	private double giamGia;
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham(String tenSp, double donGia) {
		this(tenSp, donGia, 0);
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	private double getThueNhapKhau() {
		return donGia * 0.1;
	}
	
	public void xuat() {
		System.out.println("Tên sản phẩm: " + getTenSp());
		System.out.println("Đơn giá: " + getDonGia());
		System.out.println("Giảm giá: "+ getGiamGia());
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
}
