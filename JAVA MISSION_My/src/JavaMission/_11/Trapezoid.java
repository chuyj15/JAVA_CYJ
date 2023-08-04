package JavaMission._11;
//
public class Trapezoid {
	double a, b, height;

	public Trapezoid(double a, double b, double height) {
		this.a = a;
		this.b = b;
		this.height = height;
	}
	
	public double getArea() {
		return (a+b)/2 *height;
	}
	
}
