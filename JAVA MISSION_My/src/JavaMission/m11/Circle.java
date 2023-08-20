package JavaMission.m11;

public class Circle {
	double radius;
	
	//생성자/
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius ;
	}
}
