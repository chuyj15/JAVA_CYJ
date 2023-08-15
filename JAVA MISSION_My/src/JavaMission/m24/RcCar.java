package JavaMission.m24;
/*
 * - RemoteControl 인터페이스를 구현하시오.
- 멤버변수 “배터리, 속력＂을 선언하시오.
 */
public class RcCar implements RemoteControl {
	int bat;
	int velo;
	@Override
	public void turnOn() {
		System.out.println("RcCar의 시동을 겁니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("RcCar의 시동을 끕니다.");
	}
	@Override
	public void setvelocity(int velocity) {
		if (velocity>= maxVelocity) {
			this.velo = maxVelocity;
		} else if  (velocity<= minVelocity) {
			this.velo = minVelocity;
		} else {
			this.velo = velocity;
		}
		System.out.println("RcCar의 속력을 "+this.velo+"로 설정합니다.");
	}
	@Override
	public void changeBattery() {
		System.out.println("RcCar의 배터리를 교체합니다.");
	}
	

}
