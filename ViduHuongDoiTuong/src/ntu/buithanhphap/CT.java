package ntu.buithanhphap;

import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		/*// Tạo ra 2 sản phẩm
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Bánh Bò", "Đồ ăn", "bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SG");
		sp1.setLoaiSP("Đồ uống có cồn");
		sp1.setAnhSP("sg.jpg");
		
		// In ra màn hình thông tin 2 sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSP();
			   thongtinSP2 += "Tên SP2 là " + sp2.getTenSP();
			   
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2); */
		
		//Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		//Xin mới
		dsSanPham = new ArrayList<SanPham>();
		//Nhập 3 sản phẩm
		//SanPham sp1 = new SanPham(0, "Kem", "Giải khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);
		
		//Thêm vào ArrayList
		dsSanPham.add(new SanPham(0, "Kem", "Giải khát", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		/*for (SanPham x: dsSanPham)
			System.out.println(x.toString());*/
		for (int i=0; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}

}
