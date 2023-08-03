package Day08.Ex02_NestedClass;

public class NestedClass2 {
	public static void main(String[] args) {
		//X
		// - Y
		// - Z
		
		X x= new X();
		
		//인스턴스 멤버 클래스 객체 생성
		X.Y y = x.new Y();
		y.value = 10;
		System.out.println("X의 객체 변수: "+y.value);
		y.method1();
		
		//static 멤버 클래스 객체 생성
		X.Z z = new X.Z(); //바로 X.Z로 해서 객체를 생성하고 있음. 
		//즉 X의 인스턴스 x를 만들지 않아도 객체 생성할 수 있음!
		
		z.value1 = 20;
		System.out.println("X의 Z 객체 변수 : "+z.value1);
		
		//X.Z.value2 = 30; 		//static int value2;
		//value2는 z객체를 생성하지 않아도 접근이 가능함. 
		z.value2 = 30;
		//System.out.println("X의 Z 객체 static 변수:"+X.Z.value2);
		System.out.println("X의 Z 객체 static 변수:"+z.value2);
		z.method1();
		X.Z.method2();
		z.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		x.method(); //내부에서 L 객체 생성
	}
}
