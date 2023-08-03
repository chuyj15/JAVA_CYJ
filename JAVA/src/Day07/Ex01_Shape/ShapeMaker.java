package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		double width=0.0;
		double height=0.0;
		double radius=0.0;
		//총합
		double roundSum = 0.0;
		double areaSum = 0.0;
		//입력받은 도형 정보 배열
		Shape[] shapeList = new Shape[3];
		int index =0;
		
		while (true) {
			if (index==3)		//if 조건문 뒤에 세미콜론을 쓰면 안된다.
				break;
			
			System.out.print("1.삼각형, 2.사각형, 3.원형");
			System.out.print(">>");
			String input = sc.next();
			
			if (input.equals("그만")) 
				break;
			switch (input) {
				case "1":
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("세로>>");
					height = sc.nextDouble();
					shape = new Triangle(width, height);
					shapeList[index++] = shape;
					break;
				case "2":
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("세로>>");
					height = sc.nextDouble();
					shape = new Rectangle(width, height);
					shapeList[index++] = shape;
					break;
				case "3":
					System.out.print("반지름");
					radius = sc.nextDouble();
					shape = new Circle(radius);
					shapeList[index++] = shape;
					break;
			}	//while 끝
		}
			for (Shape s : shapeList) {
				if (s==null)
					continue;
				
				//instanceof : 인스턴스를 비교하는 연산
				if (s instanceof Triangle)
					System.out.println("[삼각형]");
				if (s instanceof Rectangle)
					System.out.println("[사각형]");
				if (s instanceof Circle)
					System.out.println("[원형]");
				
				double area = s.area();
				double round = s.round();
				
				areaSum = areaSum+area;
				roundSum = roundSum+round;
				
				System.out.print("넓이: "+area+"\t");
				System.out.print("둘레: "+round+"\t");
				System.out.println();
			}
			System.out.println("넓이 총합: "+areaSum);
			System.out.println("둘레 총합: "+roundSum);
			sc.close();
			
//		Triangle triangle = new Triangle();
//		double width = sc.nextDouble();
//		double height = sc.nextDouble();
	}

}
