package Day12.Ex03_Generic;

class A {}
class B extends A {}
class C extends B {}

//타입 지정이 가능한 클래스 : B, C
class D<T extends B>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

// i) Integer 클래스만 타입매개변수로 가능하도록 제한 (효용성 X)
// ii) Number 클래스로 제한(Double, Integer 등 숫자타입의 클래스만 가능하도록 제한)
class E <T extends Number> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}


public class LimitedTypeClass {
	public static void main(String[] args) {
		D<B> d1 = new D<B>();
		D<C> d2 = new D<C>();
//		D<A> d3 = new D<A>();		//A타입은 타입매개변수로 사용불가
		//D 클래스의 타입 매개변수를 B 클래스로 제한하고 있기 때문에, 
		//B 클래스와 자식 클래스인 C만 접근 가능하다. 
		//(형변환이랑 다르게 아래(자식)만 가능하네.;. 신기하네..)
		
		d1.setT(new B());	//B로 지정했기 때문에 B를 받을 수 있음. 
		d2.setT(new C());	//C로 지정했기 때문에 C를 받을 수 있음. 
		
		d1.setT(new C());	//B로 지정했기 때문에, C로도 받을 수 있음 (업캐스팅이 가능하다)
							//d1<B> <--자식객체인 C 대입 가능( 업캐스팅)
//		d2.setT(new B());	//d2<C> <--부모객체인 B를 대입 불가( 다운캐스팅을 해야만 함)
		d2.setT((C) new B());//	<-이렇게 하면 가능함. 문법적으론 가능하나 .. 실행단계에서 오류발생 가능
		
		//타입 지정을 생략하면, 
		//제네릭 타입을 제한한 B 클래스를 기본으로 생성한다.
		D d4 = new D();		//D(B) d4 = new D<>();
		d4.setT(new B());
		d4.setT(new C());
		
		//Number 숫자타입 클래스만 타입매개변수로 사용가능한 E 객체
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		
		e1.setT(100);
		System.out.println(e1.getT());
		
		e2.setT(12.34);
		System.out.println(e2.getT());
		
		e3.setT((byte) 127);		//127을 그냥 쓰면 int니까 byte로 캐스팅해준거임. 
		System.out.println(e3.getT());
		
		//추상클래스로 부모클래스를 만들어서 피카추, 라이츄를 묶으면 된다는 말이, 왜 추상클래스로 만들어야하는지 궁금함. 
		
	}
}
