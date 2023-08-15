package JavaMission.m18;
/*
 * - Shape 클래스를 구현하시오.
- 멤버변수로 가로, 높이 길이를 저장할 변수를 선언하시오.
- 생성자를 정의하시오.
- getter, setter 메소드를 정의하시오.
- toString() 메소드를 재정의하시오.
 */
public class Rectangle extends Shape {
	double width, height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	double area() {
		return width*height;
	}

	@Override
	double round() {
		return 2*(width+height);
	}
}
