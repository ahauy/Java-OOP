package bai13;

public class Kisu extends NguoiLaoDong{
    private double luongCoBan, heSoLuong, thuong;
    private int soNgayCong;

    public Kisu() {
        super();
        luongCoBan = 0;
        heSoLuong = 0;
        thuong = 0;
        soNgayCong = 0;
    }

    public Kisu(double luongCoBan, double heSoLuong, double thuong, int soNgayCong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thuong = thuong;
        this.soNgayCong = soNgayCong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    // xay dung phuong thuc nhap thong tin :
    public void nhap() {
        super.nhap();
        System.out.print("Nhap luong co ban : ");
        luongCoBan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap he so luong : ");
        heSoLuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so ngay cong : ");
        soNgayCong = Integer.parseInt(sc.nextLine());
        if(soNgayCong >= 25) {
            thuong = 2000000;
        }
        else if(soNgayCong < 25 && soNgayCong > 15) {
            thuong = 1000000;
        }
        else if(soNgayCong <= 15) {
            thuong = 500000;
        }
        else {
            System.out.println("Nhap so ngay cong sai thong tin !!!");
        }
    }

    @Override 
    public double tinhLuong() {
        luongThang = luongCoBan*heSoLuong + thuong;
        return luongThang;
    }

    @Override 
    public String toString() {
        return super.toString() + ", luong thang: " + tinhLuong() + ", luong co ban: " + luongCoBan + ", he so luong: " + heSoLuong + ", so ngay cong: " + soNgayCong;
    }
}
