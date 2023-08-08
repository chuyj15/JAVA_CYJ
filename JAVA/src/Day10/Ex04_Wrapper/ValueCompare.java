package Day10.Ex04_Wrapper;

public class ValueCompare {
	public static void main(String[] args) {
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		//byte 범위 안에서는 같은 레퍼런스로 쓰인다. 
		System.out.println(System.identityHashCode(intObj1));//1023487453
		System.out.println(System.identityHashCode(intObj2));//1023487453
		
		System.out.println("intObj1 == intObj2");
		System.out.println("결과: "+(intObj1 == intObj2));			//true
		System.out.println("언박싱하여 비교");
		System.out.println("결과: "+(intObj1.intValue()==intObj2.intValue()));
		
		//equals()	: 래퍼객체가 가진 내부의 값을 비교하는 메서드
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과: "+intObj1.equals(intObj2));
		System.out.println("--------------------------");
		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		// ==, != 기호로 래퍼객체를 비교하면, 
		//아래의 범위에서는 내부의 값을 ==, !=기호로 바로 비교 가능
		//Boolean		: true, false
		//정수 타입		: -128~127 (Byte 범위에서 바로 비교 가능)
		//char			: \u0000~ \u007f
		//byte 범위 밖에서는 다른 레퍼런스로 쓰인다. 
		System.out.println(System.identityHashCode(intObj3));//1651191114
		System.out.println(System.identityHashCode(intObj4));//1586600255
		System.out.println("intObj3 == intObj4");
		System.out.println("결과: "+(intObj3 == intObj4));		//false
		System.out.println("언박싱하여 비교");
		System.out.println("결과: "+(intObj3.intValue()==intObj4.intValue()));		//true
		
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과: "+intObj3.equals(intObj4));		//true
		
	}
}
