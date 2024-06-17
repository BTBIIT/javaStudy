package finalex;

public class Constant {
												// 멤버변수
	int num = 10;
	final int NUM = 100;						// 상수 선언 및 초기화
	
	public static void main(String[] args) {
												// final 실습
		final int NUM1;							// 상수 선언
		NUM1 = 200;								// 처음 숫자 선언은 가능
		//NUM1 = 300;							// 고치는 것이 불가능
		Constant constant = new Constant();
		constant.num = 50;
		//NUM = 50;								// 이렇게는 불가
		
		// 상수는 이미 데이터 영역에서 만들어져서 불러오는 것이기 때문에 불가능
		
	}

}
