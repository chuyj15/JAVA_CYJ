package Day04.Ex03_Car;

public class CarEx {
	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		car.model = "제네시스";
		//car.speed = -100; 에러발생
		
		//private로 지정한 변수는 외부에서 접근 불가능
		car.setSpeed(200);
		//System.out.println("mode: "+car.getModel());
		System.out.println("model: "+car.model);
		System.out.println("speed: "+car.getSpeed());
		
		car.setSpeed(-100);
		System.out.println("speed: "+car.getSpeed());

		car.setSpeed(500);
		System.out.println("speed: "+car.getSpeed());
		
		car.setSpeed(80);
		System.out.println("speed: "+car.getSpeed());
		
		
		
	}
}
