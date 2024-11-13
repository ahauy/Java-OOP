package bai08;
import java.util.Scanner;
public abstract class Shape {
	
	Scanner sc = new Scanner(System.in);
	
	private String color;
	
	public Shape() {
		super();
	}
	
	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// phuong thuc nhap thong tin :
	public void inputInformation() {
		System.out.print("Nhập màu của hình : ");
		color = sc.nextLine();
	}
	
	// phuong thuc abstract :
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "Color : " + color;
	}
}
