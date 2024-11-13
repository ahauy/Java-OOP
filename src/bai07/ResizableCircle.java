package bai07;

public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle () {
		super();
	}
	
	public ResizableCircle(double radius) {
		super(radius);
 	}

	@Override
	public void resize(int percent) { // percent : phần 
		// TODO Auto-generated method stub
		// thay đổi kích thước hình tròn bao nhiêu percent(%) so với ban đầu :
		System.out.println("Kích thước chu vi sau khi thay đổi là : " + getPerimeter()*percent);
		System.out.println("Kích thước diện tích sau khi thay đổi là : " + getArea()*percent);
	}
	
	
}
