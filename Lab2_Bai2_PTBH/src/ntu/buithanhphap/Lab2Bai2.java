package ntu.buithanhphap;

import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình giải phương trình bậc hai ax^2 + bx + c = 0");
		
		Scanner banPhim = new Scanner(System.in);
		
		//Nhập số a
		System.out.print("Nhập số a: ");
		double a = banPhim.nextDouble();
		
		//Nhập số b
		System.out.print("Nhập số b: ");
		double b = banPhim.nextDouble();
		
		//Nhập số c
		System.out.print("Nhập số c: ");
		double c = banPhim.nextDouble();
		
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.print("Phương trình có vô số nghiệm");
				} else {
					System.out.print("Phương trình vô nghiệm");
				}
			} else {
				double x = -c/b;
				System.out.printf("Phương trình bậc nhất có nghiệm: x = %.2f", x);
			}
		} else {
			// Phương trình bậc hai
			double delta = Math.pow(b, 2) - 4 * a * c;
			
			if(delta<0) {
				System.out.print("Phương trình vô nghiệm");
			} else if(delta == 0) {
				double x = -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.2f",x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.print("Phương trình có hai nghiệm phân biệt\n");
				System.out.printf("x1 = %.2f\n", x1);
				System.out.printf("x2 = %.2f", x2);
			}
		}

	}

}
