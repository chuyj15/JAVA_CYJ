package Day04.Ex03_Car;

public class Car {
	//모델명, 속도
	String model;
	private int speed;
	
	
	//기본생성자
	public Car() {
	}
	
	//매개변수를 포함하는 생성자(1)
	public Car(String model) {
		this.model = model;
	}
	
	//매개변수를 포함하는 생성자(1)
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	//getter: 변수의 값을 가져오는 메소드
	//setter: 변수의 값을 지정하는 메소드
	//게터/세터 이름 : getName(), setName();
	// - get/set 뒤에 변수명을 첫글자를 대문자로 해서 메소를 정의(관례)
	//자동완성: alt+shift+S->R
	
	//게터
	public String getModel() {
		return model;
	}
	//세터
	public void setModel(String model) {
		this.model = model;
	}
	//게터
	public int getSpeed() {
		return speed;
	}
	//세터
	public void setSpeed(int speed) {
		if (speed<0) speed=0;
		if (speed>=300) speed=300;
		this.speed = speed;
	}
	
}
