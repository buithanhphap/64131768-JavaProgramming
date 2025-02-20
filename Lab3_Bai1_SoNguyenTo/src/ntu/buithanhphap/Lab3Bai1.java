package ntu.buithanhphap;

import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		// In ra một dòng tiêu đề App
		System.out.println("Chương trình kiểm tra đó phải là số nguyên tố hay không");
		
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập số nguyên
		System.out.print("Nhập số nguyên: ");
		int n = banPhim.nextInt();
		
		if(n<=1) {
			System.out.print(n + " không phải là số nguyên tố");
		} else {
			boolean ok =true;
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n%i == 0) {
					ok = false;
					break;
				}
			}
			if(ok) {
				System.out.println(n + " là số nguyên tố");
			} else {
				System.out.println(n + " Không phải là số nguyên tố");
			}
		}

	}

}
