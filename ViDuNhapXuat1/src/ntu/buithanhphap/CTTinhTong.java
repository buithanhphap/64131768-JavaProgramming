package ntu.buithanhphap;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("CT TINH TONG");
		
		// Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		
		//In dong huong nhan Moi nhap A
		System.out.println("Mời nhập a: ");
		double a = banPhim.nextDouble();
		
		//In dong huong nhan Moi nhap B
		System.out.println("Mời nhập b: ");
		double b = banPhim.nextDouble();
		
		//Tính tổng
		double tong = a+b;
		
		//Xuất
		System.out.print("Tổng là: ");
		System.out.print(tong);
		
	}

}
