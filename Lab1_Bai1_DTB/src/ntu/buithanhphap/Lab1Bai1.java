package ntu.buithanhphap;

import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình cho phép nhập họ và tên, điểm của sinh viên");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập Họ và tên
		System.out.print("Họ và tên: ");
		String hoTen = banPhim.nextLine();
		
		// Nhập Điểm TB
		System.out.print("Điểm TB: ");
		double diemTB = banPhim.nextDouble();
		
		//Xuất thông tin ra màn hình
		System.out.printf("%s %.1f điểm\n",hoTen, diemTB);	

	}

}
