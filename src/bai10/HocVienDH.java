package bai10;

public class HocVienDH extends HocVien{
	public static final long UU_TIEN_LOAI_1 = 1000000;
	public static final long UU_TIEN_LOAI_2 = 500000;
	
	private long donGiaDH;
	private int soBuoi;
	private int choose;
	private String loaiUuTien;
	
	public HocVienDH() {
		super();
	}
	
	public HocVienDH(String hoTen, String diaChi, String loaiChuongTrinh, long donGiaDH, int soBuoi, String loaiUuTien) {
		super(hoTen, diaChi, loaiChuongTrinh);
		this.donGiaDH = donGiaDH;
		this.soBuoi = soBuoi;
		this.loaiUuTien = loaiUuTien;
	}

	
	public String getLoaiUuTien() {
		return loaiUuTien;
	}

	public void setLoaiUuTien(String loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}

	public long getDonGiaDH() {
		return donGiaDH;
	}

	public void setDonGiaDH(long donGiaDH) {
		this.donGiaDH = donGiaDH;
	}
	
	public void inputInfomation() {
		super.inputInformation();
		System.out.print("Nhập đơn giá học đồ hoạ : ");
		donGiaDH = sc.nextInt();
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
			hocPhi = soBuoi*donGiaDH - UU_TIEN_LOAI_1;
		} else if(choose == 2) {
			hocPhi = soBuoi*donGiaDH - UU_TIEN_LOAI_2;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", don gia doa hoa : " + donGiaDH + ", so buoi : " + soBuoi +", loai uu tien : " + loaiUuTien+ ", hoc phi : " + hocPhi; 
	}
 }
