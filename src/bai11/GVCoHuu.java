
package bai11;

public class GVCoHuu extends GiangVien{
	// thuoc tinh :
	private double luongCB, heSoLuong, phuCap, thamNien; // thamNien : so nam lam viec 
	
	// ham tao ko doi so :
	public GVCoHuu() {
		super();
	}
	
	// ham tao full doi so :
	public GVCoHuu(double luongCB, double heSoLuong, double phuCap, double thamNien) {
		super();
		this.luongCB = luongCB;
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap; 
		this.thamNien = thamNien;
	}
	
	// ham nhap thong tin :
	public void inputInformation() {
		super.inputInformation();
		System.out.print("Nhap luong co ban : ");
		luongCB = sc.nextDouble();
		System.out.print("Nhap he so luong : ");
		heSoLuong = sc.nextDouble();
		System.out.print("Nhap tham nien lam viec : ");
		thamNien = sc.nextDouble();
	}
	
	// ghi de phuogn thuc tinh luong :
	@Override
	public void tinhLuong() {
		if(thamNien < 5) {
			phuCap = 0.00*luongCB;
		} else if(thamNien >= 5) {
			phuCap = (thamNien / 100)*luongCB;
		}
		luongThang = luongCB*heSoLuong + phuCap;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", luong co ban : " + luongCB + ", he so luong : " + heSoLuong + ", tham nien : " + thamNien;
	}
}
