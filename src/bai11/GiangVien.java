package bai11;
import java.util.Scanner;
public abstract class GiangVien {
	
	// thuoc tinh :
	private String hoTen, diaChi, loaiGV;
	private int choose;
	protected double luongThang;
	
	Scanner sc = new Scanner(System.in);
	
	// ham tao :
	public GiangVien() {
		super();
	}
	
	// ham tao full doi so :
	public GiangVien(String hoTen, String diaChi, String loaiGV, double luongThang) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
		this.luongThang = luongThang;
	}

	// phuong thuc nhap thong tin :
	public void inputInformation() {
		System.out.print("Nhap ten giang vien : ");
		hoTen = sc.nextLine();
		System.out.print("Nhap dia chi cua giang vien : ");
		diaChi = sc.nextLine();
		do {
			System.out.print("Nhap loai giang vien (1-giang vien co huu || 2-giang vien thinh giang) : ");
			choose = sc.nextInt();
			if(choose != 1 && choose != 2) {
				System.out.println("Ban da nhap sai so lieu !!!!");
			}
		}while(choose != 1 && choose != 2);
		if(choose == 1) {
			loaiGV = "giang vien co huu";
		}else if(choose == 2) {
			loaiGV = "giang vien thinh giang";
		}
	}
	
	// phuong thuc truu tuong :
	public abstract void tinhLuong();
	
	@Override 
	public String toString() {
		return "Ten : " + hoTen + ", dia chi : " + diaChi + ", loai giang vien : " + loaiGV + ", luong thang : " + luongThang + "VND";
	}
	
}
