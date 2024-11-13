package bai10;

public class Test {
	public static void main(String [] args) {
		// tao doi tuong hocviendh :
		HocVienDH hvdh = new HocVienDH();
		
		hvdh.inputInfomation();
		hvdh.hocPhi();
		System.out.println(hvdh);
		
        HocVienLT hvlt = new HocVienLT();
		
		hvlt.inputInfomation();
		hvlt.hocPhi();
		System.out.println(hvlt);
	}
}
