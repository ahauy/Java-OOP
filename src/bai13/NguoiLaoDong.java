package bai13;
import java.util.Scanner;
public abstract class NguoiLaoDong {
    private String hoTen, diaChi, loaiLaoDong;
    private int choose; // nếu choose == 1 thì loaiLaoDong = "Kĩ sư" || choose == 0 thì loaiLaoDong = "Lao động phổ thông"
    protected double luongThang;
    
    Scanner sc = new Scanner(System.in);
    
    // xây dựng hàm nhập thông tin :
    public void nhap() {
        System.out.print("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi = sc.nextLine();
        do {
            System.out.print("Nhap loai lao dong (0: Lao dong pho thong || 1: Ki su) : ");
            choose = Integer.parseInt(sc.nextLine());
            if(choose != 0 && choose != 1) {
                System.out.println("Nhap sai so lieu !!!!");
            }
        }while(choose != 0 && choose != 1);
    }

    // xay dung phuong thuc truu tuong :
    public abstract double tinhLuong();

    @Override 
    public String toString() {
        return "Ho ten: " + hoTen + ", dia chi: " + diaChi + ", loai lao dong: " + loaiLaoDong;
    }
}
