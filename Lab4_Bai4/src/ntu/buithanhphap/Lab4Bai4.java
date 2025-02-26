package ntu.buithanhphap;

import java.util.Scanner;

public class Lab4Bai4 {
	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập thông tin sản phẩm 1
		System.out.print("Nhập tên sản phẩm 1: ");
		String ten1 = banPhim.nextLine();
		System.out.print("Nhập đơn giá sản phẩm 1: ");
		double gia1 = banPhim.nextDouble();
		System.out.print("Nhập giảm giá sản phẩm 1: ");
		double giam1 = banPhim.nextDouble();
		
		banPhim.nextLine();
		
		// Nhập thông tin sản phẩm 2
		System.out.print("Nhập tên sản phẩm 2: ");
		String ten2 = banPhim.nextLine();
		System.out.print("Nhập đơn giá sản phẩm 2: ");
		double gia2 = banPhim.nextDouble();
		
		//Tạo đối tượng
		SanPham sp1 = new SanPham(ten1, gia1, giam1);
		SanPham sp2 = new SanPham(ten2, gia2);
		
		// Xuất
		System.out.println("Thông tin sản phẩm 1: ");
		sp1.xuat();
		System.out.println("Thông tin sản phẩm 2: ");
		sp2.xuat();
		
	}

}
