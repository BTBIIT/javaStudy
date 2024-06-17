package abstractex;
	// 기능을 하나만 구현할 것이면 abstract라는 수식어를 넣어주어야 에러가 나지 않음
public abstract class NoteBook extends Computer{ 

	
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}

	


}
