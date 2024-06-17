package finalex;


public class MainBoard {

	public static void main(String[] args) {
		// 테스트 코드(최종 시나리오) 클래스 만들기
		Player player = new Player();
		player.play(1);
		
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upGradeLevel(aLevel);
		player.play(2);
		
		
		SuperLevel sLevel = new SuperLevel();
		player.upGradeLevel(sLevel);
		player.play(3);
		
		
	}

}
