package ntu.buithanhphap;

public class Lab4Bai2 {

	public static void main(String[] args) {
		// Tạo hai đối tượng
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
		
		System.out.println("Nhập thông tin cho sản phẩm 1: ");
		sp1.nhap();
		
		System.out.println("Nhập thông tin cho sản phẩm 2: ");
		sp2.nhap();
		
		System.out.println("Thông tin sản phẩm 1: ");
		sp1.xuat();
		
		System.out.println("Thông tin sản phẩm 2: ");
		sp2.xuat();

	}

}
