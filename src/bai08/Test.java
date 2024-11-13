package bai08;

public class Test {
	public static void main(String[] args) {
		Shape shape;
		
		shape = new Rectangle();
		shape.inputInformation();
		System.out.println(shape);
		
		shape = new Triangle();
		shape.inputInformation();
		System.out.println(shape);
		
	}
}
