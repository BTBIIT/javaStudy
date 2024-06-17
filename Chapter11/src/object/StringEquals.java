package object;


public class StringEquals {

	public static void main(String[] args) {
		
		String str = null;
		// String 또는 Integer과 같은 래퍼클래스는 equals를 재정의
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);			// 힙메모리 주소 값을 비교
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		
		
//		System.out.println(str1.equals(str2));		// 인스턴스 값을 비교 == 논리적 문자열 같음 true
//		//System.out.println(str.equals("이순신"));	
//		System.out.println("이순신".equals(str));	// 실무tip equals 쓸 때 null에 대해서 주의할 것.
//	
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2);				// false
		System.out.println(i1.equals(i2));			// true
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	
	}
}
