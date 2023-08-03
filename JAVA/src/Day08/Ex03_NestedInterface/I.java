package Day08.Ex03_NestedInterface;

//아우터 클래스

public class I {
	J j; //인터페이스 선언
	
	
	//set 메소드
	void setInterface(J j) {
		this.j=j;
	}
	
	//중첩 인터페이스 생성
	static interface J{
		void method1();
		void method2();
	}
	//메소드
	void method() {
		j.method1();
		j.method2();
	}
}
