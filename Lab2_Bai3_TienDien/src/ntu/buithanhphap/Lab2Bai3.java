package ntu.buithanhphap;

import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình tính tiền điện theo phương pháp lũy tiến");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập số điện 
		System.out.print("Nhập số điện sử dụng trong tháng: ");
		int soDien = banPhim.nextInt();
		
		if(soDien < 0) {
			System.out.print("Số điện không hợp lệ, hãy nhập số dương");
		} else {
			int tien;
			if(soDien < 50) {
				tien = soDien * 1000;
			} else {
				tien = 50 * 1000 +  (soDien - 50) * 1200;
			}
			System.out.printf("Số tiền điện phải trả: %,d VNĐ\n", tien);
		}
	}

}
