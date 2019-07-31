package bbb;

public class Circle {
	private float radius;

	public Circle() {
	}
	public Circle(float radius) {
		this.radius = radius;
	}
	public  double getArea() {
		return  Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return Math.PI*radius*2;
	}
	public void show() {
		double area = getArea();
		double perimeter = getPerimeter();
		System.out.println("Բ�뾶Ϊ��"+radius+"���Ϊ��"+area+"�ܳ�Ϊ��"+perimeter);
	}
}
