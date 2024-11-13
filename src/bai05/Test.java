package bai05;

public class Test {
	public static void main(String[] args) {
		// tao mot doi tuong Truong :
		Truong truong = new Truong("THPT Que Vo 1", "Pho Moi", "ABC");
		
		// tao mot doi tuong SinhVien :
		SinhVien sv = new SinhVien("Vu Tuan Hau", 19, 'M', "12A1", "Sinh Hoc", truong);
		
		System.out.println(sv);
	}
}
