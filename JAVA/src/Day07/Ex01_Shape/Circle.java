package Day07.Ex01_Shape;

public class Circle extends Shape {
	double radius;
	//생성자
	public Circle() {
		this(0);
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}
	@Override
	double round() {
		return 2 * Math.PI * radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
