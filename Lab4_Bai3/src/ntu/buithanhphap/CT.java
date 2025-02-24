package ntu.buithanhphap;

public class CT {

	public static void main(String[] args) {
		// Tạo sản phẩm có giảm giá
		SanPham sp1 = new SanPham("Laptop", 20000, 1000);
		
		// Tạo sản phẩm không có giảm giá
		SanPham sp2 = new SanPham("iPhone", 20000);
		System.out.println("Thông tin sản phẩm 1: ");
		sp1.xuat();
		System.out.println("Thông tin sản phẩm 2: ");
		sp2.xuat();
	}

}
