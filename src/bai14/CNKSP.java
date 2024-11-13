package bai14;

public class CNKSP extends CongNhan{
    private int soSanPham, thuong;
    private double donGiaSanPam;

    public CNKSP() {
        super();
        soSanPham = 0;
        thuong = 0;
        donGiaSanPam = 0;
    }

    public CNKSP(int soSanPham, int thuong, double donGiaSanPam) {
        this.soSanPham = soSanPham;
        this.thuong = thuong;
        this.donGiaSanPam = donGiaSanPam;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public double getDonGiaSanPam() {
        return donGiaSanPam;
    }

    public void setDonGiaSanPam(double donGiaSanPam) {
        this.donGiaSanPam = donGiaSanPam;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhap so san pham lam duoc : ");
        soSanPham = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia cho moi san pham : ");
        donGiaSanPam = Integer.parseInt(sc.nextLine());
        if(soSanPham < 1100) {
            thuong = 0;
        }else if(soSanPham >= 1100 && soSanPham < 1150) {
            thuong = 1000000;
        }else if(soSanPham >= 1150) {
            thuong = 1500000;
        }
    }

    @Override 
    public double tinhLuong() {
        luongThang = soSanPham*donGiaSanPam + thuong;
        return luongThang;
    }

    @Override
    public String toString() {
        return super.toString() + ", luong thang: " + tinhLuong() + ", so san pham: " + soSanPham + ", don gia san pham: " + donGiaSanPam; 
    }
}
