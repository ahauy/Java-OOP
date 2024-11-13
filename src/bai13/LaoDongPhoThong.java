package bai13;

public class LaoDongPhoThong extends NguoiLaoDong{
    private int soNgayCong, donGiaNgayCong, thuong;

    public LaoDongPhoThong() {
        super();
        soNgayCong = 0;
        donGiaNgayCong = 0;
        thuong = 0;
    }

    public LaoDongPhoThong(int soNgayCong, int donGiaNgayCong, int thuong) {
        this.soNgayCong = soNgayCong;
        this.donGiaNgayCong = donGiaNgayCong;
        this.thuong = thuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int getDonGiaNgayCong() {
        return donGiaNgayCong;
    }

    public void setDonGiaNgayCong(int donGiaNgayCong) {
        this.donGiaNgayCong = donGiaNgayCong;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    // xay dung phuong thuc nhap thong tin :
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so ngay cong : ");
        soNgayCong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia ngay cong : ");
        donGiaNgayCong = Integer.parseInt(sc.nextLine());
        if(soNgayCong >= 25) {
            thuong = 1000000;
        }
        else if(soNgayCong < 25 && soNgayCong > 15) {
            thuong = 700000;
        }
        else if(soNgayCong <= 15) {
            thuong = 0;
        }
        else {
            System.out.println("Nhap so ngay cong sai thong tin !!!");
        }
    }

    @Override 
    public double tinhLuong() {
        luongThang = soNgayCong*donGiaNgayCong + thuong;
        return luongThang;
    }

    @Override 
    public String toString() {
        return super.toString() + ", luong thang: " + tinhLuong() + ", so ngay cong: " + soNgayCong + ", don gia ngay cong: " + donGiaNgayCong;
    }
}
