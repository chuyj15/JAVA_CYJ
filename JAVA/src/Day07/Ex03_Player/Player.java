package Day07.Ex03_Player;

public class Player {
	//선수의 난이도
	private PlayerLevel level; //변수 생성
	
	public Player() {
		level = new BeginnerLevel(); //객체 생성
		level.showLevel();
	}
	//getter
	public PlayerLevel getLevel() {
		return level;
	}
	//업그레이드 메서드: 레벨 변경 기능
	public void upgrade(PlayerLevel level) {
		this.level = level;
		level.showLevel();
	}
	
	public void play(int count) {   
		level.go(count); //PlayerLevel 템플릿 메서드 호출  
	}
	
	
}
