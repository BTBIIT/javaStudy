package string;

public class StringTest2 {
	public static void main(String[] args) {
		// 두 문자열 연결하기로 String클래스 테스트
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);	// 연결연산자
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr)) ;
		
		
		
	}
}
