package bai03;

import bai02.DiaChi;

public class Test {
	public static void main(String[] args) {
		// tao mot doi tuong DiaChi:
		DiaChi address = new DiaChi();
		address.setTinh("BAC NINH");
		// tao mot doi tuong NhanVien;
		NhanVien emp = new NhanVien("Nguyen Van A", "23/01/2005", 'M', address);
		System.out.print(emp);
	}
}
