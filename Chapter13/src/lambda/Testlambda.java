package lambda;

@FunctionalInterface
interface PrintString{
	void showString(String str);
}

public class Testlambda {

	public static void main(String[] args) {
		PrintString lambdaStr = s -> System.out.println(s);		////////////// 1. 람다식을 변수에 대입
		
//		PrintString lambdaStr_ = new PrintString() {
//			@Override
//			public void showString(String str) {
//				System.out.println(str);
//			}
//		};
//		
		// 아래 수식방식은 람다식으로 바꾸면 이런식
		lambdaStr.showString("hello lambda instacne Variable");
		
		// 밑의 수식방식
		showMyString(lambdaStr);								////////////// 2. 매서드 매개변수로 전달
	
		PrintString reStr = returnString();						////////////// 3. 반환 값으로 사용 가능
		reStr.showString("Hello, ");
	
	
	}
	
	public static void showMyString(PrintString p) {			////////////// 2. 매서드 매개변수로 전달
		// 위 과정을 축약하면 아래와 같음 
		// PrintString p1 = str -> System.out.println(str);
		p.showString("hello lambda parameter");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");			////////////// 3. 반환 값으로 사용 가능
	}
	
}
