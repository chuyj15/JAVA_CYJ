package Day16.Ex01_Lambda;

class Television {
	
	void volumeUp() { System.out.println("UP"); }
	void volumeDown() { System.out.println("DOWN"); }
	
}

interface RemoteControl {
	//추상메소드
	void volumeUp();
	void volumeDown();
}

//함수형 인터페이스 어노테이션
@FunctionalInterface 			//인터페이스가 함수형 인터페이스인지 체크(추상 메소드가 1개인지 체크)
interface Calculator {
	//추상메소드
	int calc(int a, int b);
	
	//함수형 인터페이스는 추상메소드가 2개 이상 있으면 에러 발생
//	double calc(double a, double b);	//메소드 오버로딩
}

public class TestLambda {
	
	public static void main(String[] args) {
		// 익명 자식 객체
		Television tv = new Television() {
			int channel = 0;
			
			void volumeUp() { System.out.println("UP - 자식"); }
			void volumeDown() { System.out.println("DOWN - 자식"); }
			
		};
		tv.volumeUp();
		tv.volumeDown();

		//익명 자식 객체의 메소드는 꼭 부모클래스의 메소드에 있어야 한다. 
				//자식객체를 생성 후 업캐스팅한 형태이니까, 부모에도 같은 메소드가 있어야 호출이 가능하다. 하지만 실행할 때는 자식메소드가 먼저 실행이 된다. 
				
		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.println("UP - 구현");
			}
			
			@Override
			public void volumeDown() {
				System.out.println("DOWN - 구현");
			}
		};
		rc.volumeUp();
		rc.volumeDown();
		
		// 익명 구현 객체 *
		Calculator cal = new Calculator() {
			//클래스가 이름없이implement한거임.
			//class ??? implements Calculator 
			@Override
			public int calc(int a, int b) {
				return a + b;
			}

//			@Override
//			public double calc(double a, double b) {
//				return a + b;
//			}
		};
		
		int result1 = cal.calc(10,20);
		System.out.println("result1 : "+result1);
		
		// 람다식 *
		Calculator calLambda = (a, b)->{ return a + b; } ;
		int result2 = calLambda.calc(20, 30);
//		double result3 = calLambda.calc(1.5, 3.4);
		System.out.println("result2 : "+result2);
		
		// 익명 구현 객체 * 와 람다식 * 은 같은 거다. 
		//익명 구현 객체 *을 간결하게 쓰는 방법이 람다식인거임. 
		
	}

}
