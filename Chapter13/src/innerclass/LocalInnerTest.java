package innerclass;

class Outer{
	// 멤버변수
	int outNum = 100;
	// 정적변수
	static int sNum = 200;
	
	
	
	// 메서드
	public Runnable getRunnable(int i) {		// int i 에 final이 붙어있는것과 동일
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
				System.out.println("outNum = " + outNum + " (외부클래스 인스턴스 변수)");			// 100
				System.out.println("Outer.sNum = " + Outer.sNum + " (외부클래스 정적 변수)");		// 200
				
			}
		};
//		class MyRunnable implements Runnable{	// 지역 내부 클래스
//			// MyRunnable 멤버변수
//			int localNum = 10;
//			@Override
//			public void run() {
//				// 메서드에서 지역변수는 클래스에서 사용되면 상수로 변환 ***		==> 값 변경 불가
//				// num = 200;
//				// i = 100;
//				System.out.println("i = " + i);
//				System.out.println("num = " + num);
//				System.out.println("localNum = "  + localNum);
//				System.out.println("outNum = " + outNum + " (외부클래스 인스턴스 변수)");			// 100
//				System.out.println("Outer.sNum = " + Outer.sNum + " (외부클래스 정적 변수)");		// 200
//			}
//			
//		}
//		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		// 지역내부클래스
		Outer out = new Outer();
		Runnable runnable = out.getRunnable(5);
		runnable.run();
		
			
	}
}
