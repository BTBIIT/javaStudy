package innerclass;

class OutClass{						// 외부클래스
	private int num = 10;			// 외부클래스 멤버변수 = 인스턴스 변수
	private static int sNum = 20;	// 외부클래스 정적변수 = static 변수
	//private InClass inClass;
	InClass inClass;
	
	public OutClass() {
		inClass = new InClass();	// 단 외부클래스 생성된 후 내부 클래스 생성가능
	}
	static class InStatic{
		int inNum = 100;			// 정적내부클래스의 인스턴스변수
		static int sInNum = 200;	// 정적내부클래스의 정적변수
		void inTest() {				// 정적내부클래스의 일반 메서드
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
			System.out.println("InStaticClass inNum = " + inNum + "(정적내부클래스의 인스턴스 변수)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(정적내부클래스의 정적 변수)");
		}
		static void sTest() {
			/*
			num +=10;				
			inNum += 10;			외부클래스와 정적내부 클래스의 인스턴스 변수는 사용할 수 없음
			*/
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적변수)");
			System.out.println("OutClass sNum = " + sInNum + "(정적내부클래스의 정적변수)");
		}
	
	
	}
	class InClass{					// 인스턴스 내부 클래스
		int inNum = 100;			// 내부클래스의 인스턴스 변수
		//static int sInNum = 200;	// 인스턴스 내부클래스에서 정적변수 선언불가는 JDK 8 버전까지 불가했음
		void inTest() {
			System.out.println("OutClass num = " + num + " (외부클래스 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부클래스 정적 변수)");
			}
//		static void sTest() {		// 오류 : //인스턴스 내부클래스에서 정적변수 jdk 17가능
//			
//		}
	}
	
	public void usingClass() {	// 밖에서 사용하기 위해 쓰는 방법
		inClass.inTest();
	}

}


public class InnerTest {

	public static void main(String[] args) {
		// 내부클래스 테스트
		OutClass outClass = new OutClass();
		System.out.println("외부클래스 이용하여 내부클래스 기능 호출");
		//outClass.usingClass();		// 외부클래스 내의 인스턴스 내부클래스의 있는 메서드를 사용
		outClass.inClass.inTest();
		
	}

}
