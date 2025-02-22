package ntu.buithanhphap;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình nhập mảng số nguyên");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập số lượng phần tử trong mảng
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		int n = banPhim.nextInt();
		
		int[] mang = new int[n];
		
		// Nhập các phần tử của mảng
		System.out.println("Nhập các phần tử của mảng: ");
		for(int i = 0; i < n; i++) {
			mang[i] = banPhim.nextInt();
		}
		
		// Sắp xếp mảng
		Arrays.sort(mang);
		
		// Xuất mảng đã sắp xếp
		System.out.print("Mảng sau khi sắp xếp: ");
		for(int i = 0; i < n; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println();
		
		// Tìm phần tử nhỏ nhất trong mảng
		int min = mang[0];
		for(int i = 1; i < n; i++) {
			min = Math.min(min, mang[i]);
		}
		System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
		
		// Tính trung bình cộng
		int tong = 0;
		int dem = 0;
		for(int i = 0; i < n; i++) {
			if(mang[i] % 3 == 0) {
				tong += mang[i];
				dem++;
			}
		}
		
		// Xuất
		if(dem > 0) {
			double trungbinhCong = (double) tong / dem;
			System.out.print("Trung bình cộng các phần tử chia hết cho 3 là: " + trungbinhCong);
		} else {
			System.out.print("Không tồn tại phần tử nào chia hết cho 3");
		}
	}

}
