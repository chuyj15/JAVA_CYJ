package JavaMission.m24;
/*
 * - RemoteControl 인터페이스를 선언하시오.
- RcCar 객체, Drone 객체를 생성하여, 
RemoteControl 인터페이스 변수에 대입하시오.
- RcCar 객체와 Drone 객체를 사용하는 프로그램을 자유롭게 완성하시오
 */
public class Driver {
	public static void main(String[] args) {
		
		RemoteControl rmct;
		
		RemoteControl rcCar = new RcCar();
		RemoteControl drone = new Drone();
		
		rcCar.turnOn();
		rcCar.setvelocity(50);
		rcCar.changeBattery();
		rcCar.turnOff();
		
		drone.turnOn();
		drone.setvelocity(70);
		drone.changeBattery();
		drone.turnOff();
	}
}
