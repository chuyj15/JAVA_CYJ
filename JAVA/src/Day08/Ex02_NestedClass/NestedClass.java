package Day08.Ex02_NestedClass;

public class NestedClass {
	public static void main(String[] args) {
		//아우터 클래스 A 객체 생성
		A a = new A();
		a.a=10;
		a.b=20;
		System.out.println("A의 a: "+a.b);	// 20
		System.out.println("A의 b: "+a.a);	//10
		a.aMethod();	
	
		//이너 클래스인 B 객체 생성
		A.B b=a.new B();  		//이너클래스 객체 생성시에는 꼭 이렇게 해야함. 
		//B b=new B();
		b.x = 30;
		b.y = 40;
		System.out.println("B의 x: "+b.x);	//30
		System.out.println("A의 y: "+b.y);	//40
		b.bMethod();						//
	}

}
