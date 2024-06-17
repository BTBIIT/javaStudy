package classpart;

public class _01_method2 {

	// 메서드 정의
	public static void printStar() {
		System.out.println("*******************************************************");	// 메서드를 만들어 두면 유지보수 하기 편리함
	}
		
	public static void main(String[] args) {
		// 메서드
		printStar();		//메서드를 호출할 수 있음.
		printline();
		printStar();
		printline();
		printline();
		printStar();
		printStar();
		printline();
		printline();
		printline();
		printStar();
		printStar();
		printline();
	}
	
	public static void printline() {
		System.out.println("-------------------------------------------------------");
	}


}
