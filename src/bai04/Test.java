package bai04;

public class Test {
	public static void main(String[] args) {
		// tao mot doi tuong BenhVien :
		BenhVien benhVien = new BenhVien("Bach Mai", "Ha Noi", "ABC");
		
		// tao mot duoi tuong BenhNhan :
		BenhNhan benhNhan = new BenhNhan("Nguyen Van A", 23, 'M', "Sot", "Om", benhVien);
		
		System.out.println(benhNhan);
	}
}
