package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// 추상클래스는 인스턴스 생성불가 테스트
		//Computer c1 = new Computer();
		
		Computer c2 = new Desktop(); //Desktop은 구현을 했기 때문에 (온전한 Class로 구현을 했기 때문에) 컴파일 오류가 나지 않음
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook(); // MyNoteBook도 마찬가지 이유

	}

}
