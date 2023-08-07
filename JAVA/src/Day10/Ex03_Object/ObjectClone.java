package Day10.Ex03_Object;

class Point {
	int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

//clone() 메소드를 사용하려면, Cloneable 인터페이스를 구현해야한다.
//구현하지 않으면, CloneNotSupportedException 예외가 발생한다.
class Circle implements Cloneable {
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x,y);		//this를 써도되고 안써도됨. 안겹치니깐
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	//clone 메소드 오버라이딩
	@Override
	protected Object clone() throws CloneNotSupportedException {		//예외전가->메소드호출한곳에서 처리해줘야함.
		return super.clone();
	}
	
	
	
}

public class ObjectClone {
	public static void main(String[] args) throws CloneNotSupportedException {	//하지만 메인메소드에서 또 던졌다~!
		//또 던졌다면 자바가상머신(JVM)이 처리하게 됨. 여기엔 우리가 코드를 주입할 수 없기에 건드릴 수 없음. 
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle) circle.clone();	//다운캐스팅
		System.out.println(circle);
		System.out.println(copyCircle);
		
		if (circle.equals(copyCircle)) {
			System.out.println("circle과 copyCircle은 같은 객체입니다.");
		} 
		
		//System.identityHashCode(객체) : 객체의 해시코드를 반환
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
	
	
}
