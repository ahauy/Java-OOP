package bai12;

public class SVCDCQ extends Nguoi{
    private double tDKT, sMKT, dTKTHP;
    // tDKT : tổng điểm các môn kiểm tra
    // sMKT : số môn kiểm tra
    // dTKTHP : điểm thi kết thúc học phần

    public SVCDCQ() {
        super();
    }

    public SVCDCQ(String hoTen, String ngaySinh, String diaChi, String loaiSV, double tDKT, double sMKT, double dTKTHP) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        this.tDKT = tDKT;
        this.sMKT = sMKT;
        this.dTKTHP = dTKTHP;
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
      
    public double getdTKTHP() {
        return dTKTHP;
    }

    public void setdTKTHP(double dTKTHP) {
        this.dTKTHP = dTKTHP;
    }

    // xay dung ham nhap :
    public void nhap() {
        super.nhap();
        System.out.print("Nhap tong diem cac mon kiem tra : ");
        tDKT = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so mon kiem tra : ");
        sMKT = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem thi ket thuc hoc phan : ");
        dTKTHP = Double.parseDouble(sc.nextLine());
    }

    // ghi de phuong thuc :
    public void tinhDiem() {
        dTB = (tDKT/sMKT + dTKTHP)/3;
    }

    @Override
    public String toString() {
        return super.toString() + ", tong diem trung binh cac mon: " + tDKT + ", so mon kiem tra: " + sMKT + ", diem thi ket thu hoc phan: " + dTKTHP;
    }

    
}
