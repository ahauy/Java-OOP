package bai12;

public class SVCDN extends Nguoi{
    private double tDKT, sMKT;
    // tDKT : tổng điểm các môn kiểm tra
    // sMKT : số môn kiểm tra

    public SVCDN() {
        super();
    }

    public SVCDN(String hoTen, String ngaySinh, String diaChi, String loaiSV, double tDKT, double sMKT) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        this.tDKT = tDKT;
        this.sMKT = sMKT;
    }

    public double gettDKT() {
        return tDKT;
    }

    public void settDKT(double tDKT) {
        this.tDKT = tDKT;
    }

    public double getsMKT() {
        return sMKT;
    }

    public void setsMKT(double sMKT) {
        this.sMKT = sMKT;
    }

    // xay dung ham nhap :
    public void nhap() {
        super.nhap();
        System.out.print("Nhap tong diem cac mon kiem tra : ");
        tDKT = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so mon kiem tra : ");
        sMKT = Double.parseDouble(sc.nextLine());
    }

    // ghi de phuong thuc :
    public void tinhDiem() {
        dTB = tDKT/sMKT;
    }

    @Override
    public String toString() {
        return super.toString() + ", tong diem trung binh cac mon: " + tDKT + ", so mon kiem tra: " + sMKT;
    }
}
