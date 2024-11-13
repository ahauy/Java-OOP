package bai10;
import java.util.Scanner;
public abstract class HocVien {
	
	// thuoc tinh ;
	private String hoTen, diaChi, loaiChuongTrinh;
	protected double hocPhi;
//	protected int soBuoi;
	
	Scanner sc = new Scanner(System.in);
	
	public HocVien() {
		super();
	}

	public HocVien(String hoTen, String diaChi, String loaiChuongTrinh) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}

	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	
	public void inputInformation() {
		System.out.print("Nhập tên : ");
		hoTen = sc.nextLine();
		System.out.print("Nhập địa chỉ : ");
	    diaChi = sc.nextLine();
	    System.out.print("Nhập loại chương trình : ");
		loaiChuongTrinh = sc.nextLine();
//		do {
//			System.out.print("Nhập loại ưu tiên (1-loại 1 || 2-loại 2)  : ");
//			choose = sc.nextInt();
//			String c = sc.nextLine();
//			if(choose != 1 && choose != 2) {
//				System.out.print("Nhập sai giá trị được chọn !!");
//			}
//		}while(choose == 1 && choose == 2);
//		if(choose == 1) {
//			loaiUuTien = "Loại 1";
//		} else {
//			loaiUuTien = "Loại 2";
//		}
//		System.out.print("Nhập loại chương trình : ");
//		loaiChuongTrinh = sc.nextLine();
//	}
	}
	
	public abstract void hocPhi();
	
	@Override 
	public String toString() {
		return "Ho ten : " + hoTen + ", dia chi : " + diaChi + ", loai chuong trinh : " + loaiChuongTrinh; 
	}
}
