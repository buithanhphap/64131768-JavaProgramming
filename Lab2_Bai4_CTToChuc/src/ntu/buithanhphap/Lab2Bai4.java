package ntu.buithanhphap;

import java.util.Scanner;

public class Lab2Bai4 {

	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		int chon;
		
		do {
			// Hiển thị menu
			System.out.println("+---------------------------------------------------+");
			System.out.println("1. Giải phương trình bậc nhất");
			System.out.println("2. Giải phương trình bậc 2");
			System.out.println("3. Tính tiền điện");
			System.out.println("4. Kết thúc");
			System.out.println("+---------------------------------------------------+");
			System.out.print("Chọn chức năng: ");
			chon = banPhim.nextInt();
			
			// Xử lý
			switch(chon) {
				case 1:
					giaiPTBN();
					break;
				case 2:
					giaiPTBH();
					break;
				case 3:
					tinhTD();
					break;
				case 4:
					System.out.println("Thoát chương trình");
					break;
				default:
					System.out.println("Chọn không hợp lệ");
			}
		} while (chon != 4);
		
		banPhim.close();

	}
	
	// Phương thức giải phương trình bậc nhất
	public static void giaiPTBN() {
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
				System.out.print("Phương trình có vô số nghiệm\n");
			} else {
				System.out.print("Phương trình vô nghiệm\n");
			}
		} else {
			double x = -b/a;
			System.out.printf("Nghiệm của phương trình: x = %.2f\n",x);
		}
	}
	// Phương thức giải phương trình bậc hai
	public static void giaiPTBH() {
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
					System.out.print("Phương trình có vô số nghiệm\n");
				} else {
					System.out.print("Phương trình vô nghiệm\n");
				}
			} else {
				double x = -c/b;
				System.out.printf("Phương trình bậc nhất có nghiệm: x = %.2f\n", x);
			}
		} else {
			// Phương trình bậc hai
			double delta = Math.pow(b, 2) - 4 * a * c;
					
			if(delta<0) {
				System.out.print("Phương trình vô nghiệm\n");
			} else if(delta == 0) {
				double x = -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.2f\n",x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.print("Phương trình có hai nghiệm phân biệt\n");
				System.out.printf("x1 = %.2f\n", x1);
				System.out.printf("x2 = %.2f\n", x2);
			}
		}
	}
	//Phương thức tính tiền điện
	public static void tinhTD() {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình tính tiền điện theo phương pháp lũy tiến");
				
		Scanner banPhim = new Scanner(System.in);
				
		// Nhập số điện 
		System.out.print("Nhập số điện sử dụng trong tháng: ");
		int soDien = banPhim.nextInt();
				
		if(soDien < 0) {
			System.out.print("Số điện không hợp lệ, hãy nhập số dương\n");
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
