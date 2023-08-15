package JavaMission.m24;
/*
 * - 최저속력과 최고속력 상수를 선언하시오.
- 아래의 기능이 구현될 추상 메소드를 정의하시오.
* 전원 ON
* 전원 OFF
* 속도설정
* 배터리 교체
 */
public interface RemoteControl {
	final int maxVelocity = 100;
	final int minVelocity = 0;
	
	void turnOn();
	void turnOff();
	void setvelocity(int velocity);
	void changeBattery();
}