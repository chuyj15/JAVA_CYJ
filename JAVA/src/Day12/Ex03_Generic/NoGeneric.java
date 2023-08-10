package Day12.Ex03_Generic;

class Cloth {}
class Product1 {
//	private Cloth cloth = new Cloth();		//질문 왜 여기서 객체를 미리 생성해주는거지?
	private Cloth cloth ; //라고 써도 됨. 위로 써도 어차피 set메소드로 인스턴스 새로 만들 수 있음. 
	public Cloth getCloth() {
		return cloth;
	}
	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}
}

class Computer {}

class Product2 {
	private Computer computer = new Computer();
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
}

public class NoGeneric {
	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.setCloth(new Cloth());		//그냥 cloth라고 써도 되지 않나 이미 변수로 선언해놨으니깐. 
		System.out.println(product1.getCloth());
		
		Product2 product2 = new Product2();
		product2.setComputer(new Computer());
		System.out.println(product2.getComputer());
		
		//클래스를 정의할 때, 타입을 이미 결정함
//		product1.setCloth(new Computer());		//불가능
//		product2.setComputer(new Cloth());		//불가능
		
	}
}
