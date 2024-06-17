package gamelevel;


public class Player {
	// 멤버변수
	private PlayerLevel level;
	
	// 디폴트 생성자 : 초급자 레벨로 시작하겠다.
	public Player() {
		level = new BeginnerLevel();
		// PlayerLevel level = new BignnerLevel();
		level.showLevelMessage();
	}

	
	// Getter
	public PlayerLevel getLevel() {
		return level;
	}

	// Setter //레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);	// 템플릿 메서드
		
	}


}
