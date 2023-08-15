package JavaMission.m18;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * - main() 메소드를 정의 하시오.
- 1. 삼각형, 2. 사각형, 3. 원형 으로 각 도형의 종류를 선택하시오.
- 선택된 도형에 따라 필요한 변수를 입력 받아 객체를 생성하시오.
- 여러 개의 도형 객체를 입력 받아, 리스트에 추가하시오.
- “그만＂을 입력하면, 리스트에 존재하는 도형들의 둘레와 넓이를 출력하시오.
- 마지막으로, 도형들의 둘레 총합과 넓이 총합을 출력하시오.
 */
public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape> shapearr = new ArrayList<>();
		
		while (true) {
			System.out.print("숫자를 입력하세요: 1. 삼각형 2. 사각형 3. 원형 \n입력을 그만하고 싶으면 '그만'을 입력하세요. ");
			String kind = sc.next();
			
			if (kind.equals("그만")) 
				//질문. 
				//if (kind == "그만" ) 
				//이라고 하면 왜 break가 안될까요??
				break;
			
			switch (kind) {
			case "1":
				System.out.print("밑변의 길이를 입력하시오.");
				double width = sc.nextDouble();
				System.out.print("높이를 입력하시오.");
				double height = sc.nextDouble();
				Shape triangle = new Triangle(width, height);
				shapearr.add(triangle);
				break;
			case "2":
				System.out.print("밑변의 길이를 입력하시오.");
				double width1 = sc.nextDouble();
				System.out.print("높이를 입력하시오.");
				double height1 = sc.nextDouble();
				Shape rectangle = new Rectangle(width1, height1);
				shapearr.add(rectangle);
				break;
			case "3":
				System.out.print("반지름을 입력하시오.");
				double radius = sc.nextDouble();
				Shape circle = new Circle(radius);
				shapearr.add(circle);
				break;
			}
		}
		
		double areaSum =0;
		double roundSum =0; 
		for (Shape shape : shapearr) {
			if (shape instanceof Triangle) {
				System.out.print("[삼각형]");
				Triangle triangle = (Triangle) shape;
				double a= triangle.area();
				double b=triangle.round();
				System.out.print("넓이: "+a);
				System.out.println(" 둘레: "+b);
				areaSum += a ;
				roundSum += b;
			}else if(shape instanceof Rectangle) {
				System.out.print("[사각형]");
				Rectangle rectangle = (Rectangle) shape;
				double a= rectangle.area();
				double b=rectangle.round();
				System.out.print("넓이: "+a);
				System.out.println(" 둘레: "+b);
				areaSum += a ;
				roundSum += b;
			} else {
				System.out.print("[원형]");
				Circle circle = (Circle) shape;
				double a= circle.area();
				double b=circle.round();
				System.out.printf("넓이: %.2f",a);
				System.out.printf(" 둘레: %.2f%n",b);
				areaSum += a ;
				roundSum += b;
			}
		}
		System.out.printf("넓이의 합: %.2f%n",areaSum);
		System.out.printf("둘레의 합: %.2f",roundSum);
		
		
		
		
		sc.close();
	}
}
