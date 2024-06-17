package classpart;

public class FunctionTest {

	public static void main(String[] args) {	// static에서 static을 호출하려면 이름이 같아야함
		// 함수 구현하고 호출하기
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
	}

	// 더하기 함수
	public static int add(int n1, int n2){		//n1, n2는 매개 변수
		int result = n1 + n2;	
		return result;
	}
	
	
}
