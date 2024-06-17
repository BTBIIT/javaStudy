package innerclass;

class Outer2{

	// 멤버 변수 익명 내부 클래스 대입
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수 대입하는 방식");
		}
	};
	
	// 메서드
	Runnable getRunnable(int i) {		// int i 에 final이 붙어있는것과 동일
		int num = 100;	// 지역변수는 메서드 호출시 스택에 생성
		
		return new Runnable() {					// 익명 내부 클래스
			int localNum = 10;
			@Override
			public void run() {
				// 메서드에서 지역변수는 클래스에서 사용되면 상수로 변환 ***		==> 값 변경 불가
				// num = 200;
				// i = 100;
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = "  + localNum);
				
			}
		};

	}
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		// 지역내부클래스
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(5);
		runnable.run();
		System.out.println();
		out.runner.run();
		
		
	}
}
