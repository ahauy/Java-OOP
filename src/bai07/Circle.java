package bai07;

public class Circle implements GeometricObject{
	public static final double PI = 3.14;
	
	protected double radius = 1.0; // bán kính hình tròn  = 1.0
	
	public Circle() {} 
	
	public Circle(double radius) {
		this.radius = radius;
	}

	// phuong thuc tinh chu vi
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2*radius*PI;
		return perimeter;
	}

	// phuong thuc tinh dien tich
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = PI*Math.pow(radius, 2);
		return area;
	}
}
