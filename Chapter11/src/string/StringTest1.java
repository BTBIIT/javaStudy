package string;

public class StringTest1 {

	public static void main(String[] args) {
		// String 클래스
		// 생성자의 매개변수로 문자열 생성
		String str1 = new String("abc");
		String str2 = new String("abc"); 				// 문자열 상수를 가리키는 방식
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "test"; 							// 문자열 상수를 가리키는 방식
		String str4 = "test";
		System.out.println(str3 == str4);				// String
		System.out.println(str3.equals(str4));			// String
	}
	
}
