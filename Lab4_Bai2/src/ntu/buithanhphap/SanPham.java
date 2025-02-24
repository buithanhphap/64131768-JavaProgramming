package ntu.buithanhphap;

import java.util.Scanner;

public class SanPham {
	//Thuộc tính
	String tenSp;
	double donGia;
	double giamGia;
	
	public SanPham() {
		super();
	}
	
	public SanPham(String tenSp, double donGia, double giamGia) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public double getThueNhapKhau() {
		return donGia * 0.1;
	}
	
	 // Phương thức xuất thông tin sản phẩm ra màn hình
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu (10%): " + getThueNhapKhau());
    }

    // Phương thức nhập thông tin sản phẩm từ bàn phím
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá sản phẩm: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhập mức giảm giá (%): ");
        giamGia = scanner.nextDouble();
    }
    // Getter và Setter
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
}
