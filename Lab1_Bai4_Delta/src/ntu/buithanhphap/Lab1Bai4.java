package ntu.buithanhphap;

import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// In một dòng tiêu đề App
		System.out.println("Chương trình tính delta và căn delta của phương trình bậc 2");
		
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
		
		// Tính delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		//Xuất
		System.out.print("Delta: ");
		System.out.print(delta);
		
		if(delta >= 0) {
			double canDelta = Math.sqrt(delta);
			System.out.print("\nCăn delta: ");
			System.out.print(canDelta);
		} else {
			System.out.print("\nDo delta âm nên không thể tính căn delta được");
		}
	}

}
