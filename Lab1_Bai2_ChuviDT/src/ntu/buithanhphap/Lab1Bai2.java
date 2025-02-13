package ntu.buithanhphap;

import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình tính chu vi, diện tích và cạnh nhỏ nhất của hình chữ nhật");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập chiều dài
		System.out.println("Nhập chiều dài: ");
		double dai = banPhim.nextDouble();
		
		// Nhập chiều rộng
		System.out.println("Nhập chiều rộng: ");
		double rong = banPhim.nextDouble();
		
		// Tính toán
		double chuVi = (dai + rong) * 2;
		double dienTich = dai * rong;
		double canhNho = Math.min(dai, rong);
		
		//Xuất
		System.out.printf("Chu vi: %.1f\n", chuVi);
		System.out.printf("Diện tích: %.1f\n", dienTich);
		System.out.printf("Cạnh nhỏ nhất: %.1f\n", canhNho);

	}

}
