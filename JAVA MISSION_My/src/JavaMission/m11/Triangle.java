package JavaMission.m11;
//
public class Triangle {
	double width=0;
	double height=0;
	
	//생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return (width*height)/2;
	}
}
