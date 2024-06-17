package string;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		//Wrapper 클래스 테스트
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
//		int i = 1;
//		double d = 10;
//		char c = 'a';
		Integer i = 1;
		Double d = 10.0;
		Character c = 'c';
		
		System.out.println(i.intValue());
		System.out.println(d.intValue());
		System.out.println(c.charValue());
		
		
		String str  = "1000";
		System.out.println(Integer.parseInt(str) + 100); // 실무활용도 높음
		System.out.println(str + 100);
		
	}
	

}
