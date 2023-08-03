package Day07.Ex02_Computer;

public class User {
	public static void main(String[] args) {
		Computer computer = new DeskTop();
		// Computer computer2 = new Laptop(); //추상 클래스는 객체로 생성할 수 없다.
		
		Computer computer2 = new Gram();
		Laptop laptop = new Gram();
		Gram gram = new Gram();
		
		computer.turnOn(); //전원을 켭니다.
		computer.display(); //DeskTop - display
		computer.typing(); //DeskTop - typing
		computer.turnOff(); //전원을 끕니다.
		
		computer2.turnOn();
		computer2.display(); //Laptop - display
		computer2.typing(); //Gram - typing
		computer2.turnOff();
		
		laptop.turnOn();
		laptop.display(); //Laptop - display
		laptop.typing(); //Gram - typing
		laptop.turnOff();
		
		gram.turnOn();
		gram.display(); //Laptop - display
		gram.typing(); //Gram - typing
		gram.turnOff();
		
		
		
	}
}
