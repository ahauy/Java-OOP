package bai08;

public class Triangle extends Shape{
private int base, height;
	
	public Triangle() {
		super();
	}
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	// xay dung phuong thuc nhap thong tin :
	public void inputInformation() {
		super.inputInformation();;
		System.out.print("Nhập chiều cao của hình tam giác : ");
		height = sc.nextInt();
		System.out.print("Nhập chiều dài đáy của hình tam giác : ");
		base = sc.nextInt();
	}
	
	@Override 
	public double getArea() {
		double area = (1/2)*base*height;
		return area;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", base : " + base + ", height : " + height;
	}
}
