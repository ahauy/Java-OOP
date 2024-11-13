package bai11;

public class Test {
	public static void main(String[] args) {
		GiangVien gv;
		
		gv = new GVCoHuu();
		gv.inputInformation();
		gv.tinhLuong();
		System.out.println(gv);
		
		gv = new GVThinhGiang();
		gv.inputInformation();
		gv.tinhLuong();
		System.out.println(gv);
	}
}
