package ntu.buithanhphap;

import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình tính thể tích của khối lập phương");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập cạnh của khối lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = banPhim.nextDouble();
		
		// Tính thể tích
		double theTich = Math.pow(canh, 3);
		
		//Xuất
		System.out.print("Thể tích của khối lập phương là: ");
		System.out.print(theTich);

	}

}
