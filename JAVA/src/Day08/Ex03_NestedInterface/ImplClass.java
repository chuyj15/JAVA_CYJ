package Day08.Ex03_NestedInterface;
//카드 출결을 구현해놓은 것
public class ImplClass implements I.J {
		
	
	@Override
	public void method1() {
		System.out.println("중첩 인터페이스 - method1()");
	}

	@Override
	public void method2() {
		System.out.println("중첩 인터페이스 - method2()");
	}
}
