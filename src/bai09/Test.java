package bai09;
import java.util.Scanner;
import java.util.ArrayList;
import bai08.Rectangle;
import bai08.Triangle;
import bai08.Shape;

public class Test {
	public static void main(String[] args) {
		Shape shape[] = new Shape[] { new Rectangle(), new Rectangle(), new Triangle() };
		
		for(Shape i : shape) { 
			if(i instanceof Rectangle) {
				System.out.println("Phan tu thu thuoc lop Rectangle.");
			} else {
				System.out.println("Phan tu thu thuoc lop Triangle.");

			}
		}
	}
}
