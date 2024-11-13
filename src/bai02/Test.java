package bai02;

public class Test {
	public static void main(String[] args) {
		// tao mot doi tuong :
		DiaChi address = new DiaChi();
		
		// truyen du lieu cho thuoc tinh : xa 
		address.setXa("Dai Xuan");
		
		// in 
		System.out.print(address.getXa());
	}
}
