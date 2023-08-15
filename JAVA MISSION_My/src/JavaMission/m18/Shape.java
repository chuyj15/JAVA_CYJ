package JavaMission.m18;

public abstract class Shape {
	Point point;
	
	public Shape() {
	}
	
	public Shape(Point point) {
		this.point = point;
	}

	//추상메소드
	abstract double area();  //넓이
	abstract double round();  //둘레

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	
}
