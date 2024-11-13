package bai14;
import java.util.Scanner;
public abstract class CongNhan {
    private String hoTen, diaChi, loaiCongNhan;
    protected double luongThang;
    private int choose;
    Scanner sc = new Scanner(System.in);

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

    public String getLoaiCongNhan() {
        return loaiCongNhan;
    }

    public void setLoaiCongNhan(String loaiCongNhan) {
        this.loaiCongNhan = loaiCongNhan;
    }

    // xay dung phuong thuc nhap thong tin :
    public void nhap() {
        System.out.print("Nhap ho va ten : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi = sc.nextLine();
        do {
            System.out.print("Nhap loai cong nhan (0: Cong nhan khoan san pham || 1: Cong nhan tinh cong nhat) : ");
            choose = Integer.parseInt(sc.nextLine());
            if(choose != 0 && choose != 1) {
                System.out.println("Ban da nhap sai!! VUI LONG NHAP LAI !!!");
            }
        }while(choose != 1 && choose != 0);
        
        if(choose == 0) {
            loaiCongNhan = "Cong nhan khoan san pham ";
        }else if(choose == 1) {
            loaiCongNhan = "Cong nhan tinh cong nhat";
        }
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", dia chi: " + diaChi + ", loai cong nhan: " + loaiCongNhan;
    }
}
