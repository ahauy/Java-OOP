package bai12;
import java.util.Scanner;
public abstract class Nguoi {
    // thuoc tinh :
    private String hoTen, ngaySinh, diaChi, loaiSV;
    private int choose;
    protected double dTB = 0; // điểm trung bình

    Scanner sc = new Scanner(System.in);

    //ham tao :
    public Nguoi() {}

    // ham tao full doi so :
    public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSV) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSV = loaiSV;
    }

    //---------getters and setters---------------
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiSV() {
        return loaiSV;
    }

    public void setLoaiSV(String loaiSV) {
        this.loaiSV = loaiSV;
    }

    // xay dung phuong thuc nhap thong tin :
    public void nhap() {
        System.out.print("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi = sc.nextLine();
        do {
            System.out.print("Nhap loai sinh vien (1: sinh vien cao dang nghe || 2: sinh vien cao dang chinh quy) : ");
            choose = Integer.parseInt(sc.nextLine());
            if(choose != 1 && choose != 2) {
                System.out.println("Chon sai du lieu !!");
            }
        }while(choose != 1 && choose != 2);
        if(choose == 1) {
            loaiSV = "SVCDN";
        }else if(choose == 2) {
            loaiSV = "SVCDCQ";
        }
    }

    // xay dung phuong thuc tinhDiem :
    public abstract void tinhDiem();
    
    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", ngay sinh: " + ngaySinh + ", dia chi: " + diaChi + ", loai sinh vien: " + loaiSV  + ", diem trung binh: " + dTB;
    }
}
