package bai05;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary;
        try {
            System.out.print("Nhap luong cua ban : ");
            salary = sc.nextInt();
            if(salary < 5000000 || salary > 20000000) {
                throw new OutOfRangeException("Nhap so luong khong hop le !! Luong phai nam trong khoang 5 --> 20 trieu.");
            }
            System.out.println("Luong cua ban la : " + salary);
        }catch(OutOfRangeException oore) {
            System.out.println("ERROR: " + oore.getMessage());
        }
        sc.close();
    }
}
