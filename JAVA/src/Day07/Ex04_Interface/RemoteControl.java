package Day07.Ex04_Interface;

public interface RemoteControl {
	//상수
	//인터페이스 변수는 public static final로 자동으로 선언된다. 
	int MAX_VOLUME = 10; //상수는 대문자 스네이크케이스로 씀
	int MIN_VOLUME = 0; 
	//추상 메소드
	// : public abstract 를 생략하고 작성할 수 있다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//디폴트 메소드
	//: 구현한 객체가 기본으로 사용할 수 있는 메소드
	//: 오버라이딩을 하지 않아도 됨!!!
	//디폴트를 다른 걸로 바꿀 수 없음. 
	//인터페이스에선 추상메소드만 원래 정의할 수 있음. 
	//그래서 디폴트메소드랑 스태틱메소드를 만들 수 있도록 허용해줌. 
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 설정");
			setVolume(0);
		} else {
			System.out.println("음소거 해제");
			setVolume(5);
		}
	}
	
	//static메소드(정적 메소드)
	// : 구현 객체가 없어도 인터페이스만으로도 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환");
	}
}
