package Day08.Ex03_NestedInterface;

public class InnerInterfaceEx {
	public static void main(String[] args) {
		//중첩 인터페이스의 아우터 클래스인 객체 생성
		I i = new I();
		
		//구현 객체를 메소드를 통해 지정
		i.setInterface(new ImplClass()); //카드로 출결하겠다.
		//인터페이스 타입 객체명 = new 구현 클래스();
		//인터페이스 타입 객체명 : 인터페이스타입 변수로 생각하면 됨. 
		i.method();
	}
}


//출력
//중첩 인터페이스 - method1()
//중첩 인터페이스 - method2()
