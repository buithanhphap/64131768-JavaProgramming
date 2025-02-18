package ntu.buithanhphap;

import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình giải phương trình bậc nhất ax + b = 0");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập hệ số a
		System.out.print("Nhập số a: ");
		double a = banPhim.nextDouble();
		
		// Nhập hệ số b
		System.out.print("Nhập số b: ");
		double b = banPhim.nextDouble();
		
		if(a==0) {
			if(b == 0) {
				System.out.print("Phương trình có vô số nghiệm");
			} else {
				System.out.print("Phương trình vô nghiệm");
			}
		} else {
			double x = -b/a;
			System.out.printf("Nghiệm của phương trình: x = %.2f",x);
		}

	}

}
