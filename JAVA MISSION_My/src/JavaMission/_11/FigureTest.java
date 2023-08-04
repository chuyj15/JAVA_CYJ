package JavaMission._11;
/*
 아래의 주어진 코드를 실행 시켰을 때, 출력 예시와 같은 결과가 나오도록 
 [Triangle.java, Rectangle.java, Circle.java, Trapezoid.java] 클래스를 정의하시오.
 */
public class FigureTest {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		Rectangle rectangle = new Rectangle(10, 20); 
		Circle circle = new Circle(5);
		Trapezoid trapezoid = new Trapezoid(5, 10, 8);
	
		System.out.println("삼각형의 넓이 : " + triangle.getArea());
		System.out.println("사각형의 넓이 : " + rectangle.getArea());
		System.out.println("원형의 넓이 : " + circle.getArea());
		System.out.println("사다리꼴의 넓이 : " + trapezoid.getArea());
	}
}
