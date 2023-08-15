package JavaMission.m18;
/*
 * 멤버변수로 반지름 길이를 저장할 변수를 선언하시오.
- 생성자를 정의하시오.
- getter, setter 메소드를 정의하시오.
- toString() 메소드를 재정의하시오.
 */
public class Circle extends Shape {
	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
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

	@Override
	double area() {
		return radius*radius*Math.PI;
	}

	@Override
	double round() {
		return 2*radius*Math.PI;
	}
	
	
	
	
}
