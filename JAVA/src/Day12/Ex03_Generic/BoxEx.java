package Day12.Ex03_Generic;

import Day03.Class.Pikachu;

public class BoxEx {
	//제네릭
	//: 모든 클래스 타입을 다룰 수 있도록, 클래스와 메소드를 작성하는 기법
	// - 타입매개변수: 모든 클래스 타입을 일반화한 변수
	// - 객체를 생성할 때, 타입을 결정한다.
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		box1.setT("쿠팡택배");
		String boxName = box1.getT();
		System.out.println(boxName);
		
		Box<Integer> box2 = new Box<Integer>();		//int라고 쓸 수 없는 이유: 기본자료형이기 때문에.
		box2.setT(100);
		int value = box2.getT();
		System.out.println(value);
		
		Box<Pikachu> box3 = new Box<Pikachu>();
		box3.setT(new Pikachu());
		Pikachu pikachu = box3.getT();
		System.out.println(pikachu);
		
		//제네릭기법의 타입으로는 "클래스"만 사용할 수 있다.
		//기본 타입은 지정할 수 없다.
		//Box<int> box = new Box<int>();	//에러
	}
}
