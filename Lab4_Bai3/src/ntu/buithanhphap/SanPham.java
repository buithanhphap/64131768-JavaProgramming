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
	private double getThueNhapKhau() {
		return donGia * 0.1;
	}
	
	public void xuat() {
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: "+ giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
}
