package bbb;

public class Cylinder extends Circle {
	private double hight;
	public Cylinder(float radius,double hight) {
		super(radius);
		this.hight = hight;
	}
public double getVolume() {
	return getArea()*hight;
} 
public void showVolume() {
	double volume = getVolume();
	
System.out.println(" Բ����ĸߣ�"+hight+" Բ���������"+volume);
}
}


