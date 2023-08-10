package Day12.Ex03_Generic;
//이해함.
public class LimitedTypeMethod {
	
//제네릭 메소드 타입 제한
//Number : 자식클래스( Integer, Double 등 숫자관련 클래스)
	public <T extends Number> void method(T t) {		//T의 타입을 모르는데 intValue, doubleValue 를 쓸 수 있는 이유:  <T extends Number> 해놔서.
		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
	
	public static void main(String[] args) {
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.method(1234);
		ltm.method(12.34);
		
		//Number 클래스와 그 자식 클래스들로 타입이 제한된다. 
		//ltm.method("12.34"); //문자열로 제한
	}
}
