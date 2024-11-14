package bai01;
import java.util.Scanner;
public class Chia2So {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a : ");
		int a = sc.nextInt();
		System.out.print("Nhap b : ");
		int b = sc.nextInt();
		try {
			System.out.print((1.0*a) / b);
		}catch(ArithmeticException e) {
			System.out.println("ERROR : " + e.getMessage());
		}
			
	}
}
