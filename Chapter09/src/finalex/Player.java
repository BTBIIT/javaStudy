package finalex;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessege();
	}
	
	public void play(int count) {
		level.go(count);
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upGradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessege();
	}
	
	
}
