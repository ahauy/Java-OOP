package bai10;

public class HocVienLT extends HocVien{
	public static final long UU_TIEN_LOAI_1 = 1000000;
	public static final long UU_TIEN_LOAI_2 = 500000;
	
	private long donGiaLT;
	private int soBuoi;
	int choose;
	private String loaiUuTien;
	
	public HocVienLT() {
		super();
	}
	
	public HocVienLT(String hoTen, String diaChi, String loaiChuongTrinh, long donGiaLT, int soBuoi, String loaiUuTien) {
		super(hoTen, diaChi, loaiChuongTrinh);
		this.donGiaLT = donGiaLT;
		this.soBuoi = soBuoi;
		this.loaiUuTien = loaiUuTien;
	}

	
	public String getLoaiUuTien() {
		return loaiUuTien;
	}

	public void setLoaiUuTien(String loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}

	public long getDonGiaLT() {
		return donGiaLT;
	}

	public void setDonGiaLT(long donGiaLT) {
		this.donGiaLT = donGiaLT;
	}
	
	public void inputInfomation() {
		super.inputInformation();
		System.out.print("Nhập đơn giá học lập trình : ");
		donGiaLT = sc.nextInt();
		System.out.print("Nhập số buổi học : ");
		soBuoi = sc.nextInt();
		do {
			System.out.print("Nhập loại ưu tiên (1-loại 1 || 2-loại 2)  : ");
			choose = sc.nextInt();
			//String c = sc.nextLine();
			if(choose != 1 && choose != 2) {
				System.out.print("Nhập sai giá trị được chọn !!");
			}
		}while(choose != 1 && choose != 2);
		if(choose == 1) {
			loaiUuTien = "Loại 1";
		} else {
			loaiUuTien = "Loại 2";
		}
	}
	
	@Override 
	public void hocPhi() {
		if(choose == 1) {
			hocPhi = soBuoi*donGiaLT - UU_TIEN_LOAI_1;
		} else if(choose == 2) {
			hocPhi = soBuoi*donGiaLT - UU_TIEN_LOAI_2;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", don gia lap trinh : " + donGiaLT + ", so buoi : " + soBuoi +", loai uu tien : " + loaiUuTien+ ", hoc phi : " + hocPhi; 
	}
}
