package Day03.Class;

public class Pikachu {
	//클래스: 객체를 정의하는 설계도
	//멤버: 변수, 메소드
	
	//변수
	public int energy; // 기본 자료형인  int : 기본으로 0으로 넣어줌
	public String type; //참조 자료형 : 기본으로 null
	public int level;
	
	//(1) 생성자: 기본생성자
	public Pikachu() { //매개변수가 없는 생성자: ()안에 아무것도 없음 : 기본생성자
		energy = 100;
		type = "전기";
		level = 1;
	}
	
//	//(2)  this( ) :  생성자에서 다른 생성자를 호출하는 메소드
//	public Pikachu() {
//		this(100, "전기", 1);
//	}
	
	//메소드(생성자) 오버로딩. 메소드이름은 피카츄인데 받는 매개변수가 다름~!
	//(3) 생성자 자동완성 : 매개변수가 있는 생성자
	//alt+shift+S->O //생성자 생성 using fields
	public Pikachu(int energy, String type, int level) {
		this.energy = energy;
		this.type = type;
		this.level = level;
	}

	
	//메소드
	//접근지정자 반환타입 메소드명(매개변수){ }
	public String aAttack() {
		return "십만볼트";
	}
	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}
	
}
