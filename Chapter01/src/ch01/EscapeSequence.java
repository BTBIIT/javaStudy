package ch01;

public class EscapeSequence {

	public static void main(String[] args) {
		// \n : 줄바꿈, \t : 탭, \" : 큰따옴표 출력
		/* 
		 \n : 줄바꿈
		 \t : 탭
		 \" : 큰따옴표 출력
		 */
		System.out.println("write \non\nce"); 
		System.out.println("사과\t배\t귤");
		System.out.println("apple\tpear\torange");
		System.out.println("사과    배    귤");
		System.out.println("apple  pear orange");
		System.out.println("강아지는 \"멍멍\"");
		System.out.println("\\t :탭 \n\\n : 줄바꿈 \n\\\"원하는 문장\\\" : 큰따옴표 출력 ");
		System.out.println("\\");

	}

}
