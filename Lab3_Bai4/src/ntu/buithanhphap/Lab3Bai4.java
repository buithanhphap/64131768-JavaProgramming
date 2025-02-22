package ntu.buithanhphap;

import java.util.Scanner;

public class Lab3Bai4 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình nhập 2 mảng họ tên và điểm của sinh viên");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập số lượng sinh viên
		System.out.print("Nhập số lượng sinh viên: ");
		int n = banPhim.nextInt();
		banPhim.nextLine();
		
		// Khai báo mảng chứa họ tên
		String[] hoTen = new String[n];
		double[] diem = new double[n];
		
		// Nhập thông tin sinh viên
		for(int i = 0; i < n; i++) {
			System.out.print("Nhập họ tên sinh viên thứ " + (i+1) + ": ");
			hoTen[i] = banPhim.nextLine();
			System.out.print("Nhập điểm sinh viên thứ " + (i+1) + ": ");
			diem[i] = banPhim.nextDouble();
			banPhim.nextLine();
		}
		
		System.out.print("\nDanh sách sinh viên: ");
		for (int i = 0; i < n; i++) {
			String hocLuc = "";
			if(diem[i] < 5) {
				hocLuc = "Yếu";
			} else if (diem[i] >= 5 && diem[i] < 6.5) {
				hocLuc = "Trung bình";
			} else if (diem[i] >= 6.5 && diem[i] < 7.5) {
				hocLuc = "Khá";
			}  else if (diem[i] >= 7.5 && diem[i] < 9) {
				hocLuc = "Giỏi";
			} else if (diem[i] >= 9) {
				hocLuc = "Xuất sắc";
			}
			System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc);
		}
		
		//Sắp xếp sinh viên theo điểm
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (diem[j] > diem[j + 1]) {
					// Hoán đổi điểm
					double temp = diem[j];
					diem[j] = diem[j+1];
					diem[j+1] = temp;
					
					// Hoán đổi họ tên 
					String tempHoTen = hoTen[j];
					hoTen[j] = hoTen[j+1];
					hoTen[j+1] = tempHoTen;
				}
			}
		}
		// Xuất 
		System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm: ");
		for(int i = 0; i < n; i++) {
			String hocLuc = "";
			if(diem[i] < 5) {
				hocLuc = "Yếu";
			} else if (diem[i] >= 5 && diem[i] < 6.5) {
				hocLuc = "Trung bình";
			} else if (diem[i] >= 6.5 && diem[i] < 7.5) {
				hocLuc = "Khá";
			}  else if (diem[i] >= 7.5 && diem[i] < 9) {
				hocLuc = "Giỏi";
			} else if (diem[i] >= 9) {
				hocLuc = "Xuất sắc";
			}
			System.out.println("Họ tên: " + hoTen[i] + ", Điểm: " + diem[i] + ", Học lực: " + hocLuc);
		}

	}

}
