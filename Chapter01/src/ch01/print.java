package ch01;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("apple"); //문자열
		System.out.println();
		System.out.print("banana");
		System.out.print("orange");
		System.out.println(); // 줄바꿈
		System.out.println(5); // 정수
		System.out.println(5.897); // 실수
		System.out.println('A'); // 문자, 한 글자일 때 문자열을 사용
		
		//연산 결과
		System.out.println(3+5);
		System.out.println(3.9 * 5.72);
		System.out.println(10 / 3); // 정수 연산에서의 몫 값이 출력
		System.out.println(10 / 3.0); // 나눠지는 쪽 나누는 쪽 둘 중 하나가 실수이면 실수연산이 됨.
		System.out.println(10 % 3); // 나머지 연산자
		System.out.println((10 / 3) + (10 % 3));
		
		System.out.println("덧셈 결과는 " + (3 + 5));
		System.out.println("뺄셈 결과는 " + (3 - 5));
		System.out.println("곱셈 결과는 " + 3 * 5 + "입니다."); // 곱셈이 덧셈보다 연산자 
													//순위가 높기 때문에 괄호가 나오지 않아도 괜찮음
		
		// printf(format) 
		// %d = decimal : 10진 정수
		// %f = float : 실수(소수점 이하 6자리 출력)
		// %c = character : 문자
		// %s = string : 문자열
		System.out.printf("곱셈 결과는  %d 입니다.\n", 3*5);
		System.out.printf("%d + %d = %d\n", 3,5,(3+5));
		
		System.out.printf("실수는 %f입니다\n", 3.7189); // 포맷이 맞아야 함 포맷팅 에러가 일어나므로
		System.out.printf("실수는 %.2f입니다\n", 3.7189); // 2째자리에서 반올림
		System.out.printf("문자 : %c\n", 'T'); //문자 상수
		System.out.printf("문자열 : %s\n", "write once");
	
	}

}
