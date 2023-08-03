package Day07.Ex02_Computer;

public abstract class Computer {
	//추상메소드를 정의하면 abstract키워드를 메소드와 클래스에 붙여줘야 한다. 
	//추상메소드를 정의하면 class도 추상클래스로 정의해야 한다. 
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
