package ntu.buithanhphap;

public class Lab3Bai2 {

	public static void main(String[] args) {
		//
		System.out.println("Bảng Cửu Chương từ 1 đến 9: ");
		
		for(int i = 1; i <= 9; i++ ) {
			System.out.println("Bảng " + i + ":");
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}

	}

}
