package _11;
//
public class Rectangle {
	double width=0;
	double height=0;
	
	//생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
}
