package Day07.Ex01_Shape;

public class Rectangle extends Shape {
	double width, height;
	//생성자
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	//오버라이딩 메서드
	@Override
	double area() {
		return width*height;
	}

	@Override
	double round() {
		return 2*(width+height);
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
}
