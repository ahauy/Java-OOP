package bai14;

public class CNTCN extends CongNhan{
    private int luongCoBan, soNgayCong;
    private double thuong;
    private double heSoLuong;

    public CNTCN() {
        super();
        luongCoBan = 0;
        thuong = 0;
        soNgayCong = 0;
        heSoLuong = 0;
    }

    public CNTCN(int luongCoBan, int thuong, int soNgayCong, double heSoLuong) {
        super();
        this.luongCoBan = luongCoBan;
        this.thuong = thuong;
        this.soNgayCong = soNgayCong;
        this.heSoLuong = heSoLuong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
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

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap luong co ban : ");
        luongCoBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap he so luong : ");
        heSoLuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so ngay cong : ");
        soNgayCong = Integer.parseInt(sc.nextLine());
        if(soNgayCong < 20) {
            thuong = 0;
        }
        else {
            thuong = (double) (1.2*luongCoBan);
        }
    }

    @Override
    public double tinhLuong() {
        luongThang = luongCoBan*heSoLuong + thuong;
        return luongThang;
    }

    @Override
    public String toString() {
        return super.toString() + ", luong thang: " + tinhLuong() + ", luong co ban: " + luongCoBan + ", he so luong: " + heSoLuong;
    }
    
}
