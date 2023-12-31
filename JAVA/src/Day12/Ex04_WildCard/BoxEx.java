package Day12.Ex04_WildCard;

import Day03.Class.Pikachu;
import Day03.Class.Raichu;

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
		
		//제네릭 와일드카드
		// - 알 수 없는 타입을 대체하여 사용하는 기호
		// - 주로 타입제한을 주기 위해서 사용한다.
		// - 1) ? super T : 해당 클래스부터 상위클래스를 허용하도록 제한
		// - 2) ? extends T : 해당 클래스부터 하위클래스를 허용하도록 제한
		
		Box<?> wildcardBox1 = box1;
		Box<?> wildcardBox2 = box2;
		Box<?> wildcardBox3 = box3;
//		Box<? super Raichu> wildcardBox2 = box2;
//		Box<? extends Number> wildcardBox3 = box3;
		
		// T t : 새로 new로 생성 시에... //정의할 때
		// ? : 이미 생성된 객체를 사용하는 것. //이미 생성된 객체인데, 그 객체의 타입이 먼지 모르고 선언할 때 사용.
	}
}
