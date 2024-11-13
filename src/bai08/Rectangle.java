package bai08;

public class Rectangle extends Shape{
	private int length, width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	// xay dung phuong thuc nhap thong tin :
	public void inputInformation() {
		super.inputInformation();;
		System.out.print("Nhập chiều dài của hình chữ nhât : ");
		length = sc.nextInt();
		System.out.print("Nhập chiều  của hình chữ nhât : ");
		width = sc.nextInt();
	}
	
	@Override 
	public double getArea() {
		double area = length*width;
		return area;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", length : " + length + ", width : " + width;
	}
}
