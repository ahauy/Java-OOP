package bai11;

public class GVThinhGiang extends GiangVien{
	
	// thuoc tinh :
	private double donGia, thuNhap, soTietDay;
	
	// ham tao khong doi so :
	public GVThinhGiang() {
		super();
	}
	
	// ham tao full doi so :
	public GVThinhGiang(double donGia, double thuNhap, double soTietDay) {
		super();
		this.donGia = donGia;
		this.thuNhap = thuNhap;
		this.soTietDay = soTietDay;
	}
	
	// xay dung phuong thuc nhap thong tin :
	public void inputInformation() {
		super.inputInformation();
		System.out.print("Nhap so tiet day : ");
		soTietDay = sc.nextDouble();
		System.out.print("Nhap don gia cho moi tiet day : ");
		donGia = sc.nextDouble();
	}
	
	@Override 
	public void tinhLuong() {
		thuNhap = 0.15*(soTietDay * donGia);
		luongThang = soTietDay*donGia - thuNhap;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", don gia : " + donGia + ", so tiet day : " + soTietDay;
	}
}
