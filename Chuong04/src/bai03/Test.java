package bai03;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true) {
            System.out.print("Nhap chuoi tu ban phim : ");
            str = sc.nextLine();

            if(str.equalsIgnoreCase("DONE")) {
                System.out.println("Ket thuc viec nhap chuoi !!");
                break;
            }
        try {
            if(str.length() > 30) {
                throw new StringToolLongException("Chuoi vua nhap vuot qua do dai quy dinh ( <= 30 ) !!!");
            }else {
                System.out.println("Chuoi vua nhap la hop le : " + str);
            }
        }catch(StringToolLongException stle) {
            System.out.println("ERROR : " + stle.getMessage());
            System.exit(0);
        }
    }
    sc.close();
    }
}
