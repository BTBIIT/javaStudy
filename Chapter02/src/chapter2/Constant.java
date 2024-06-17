package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100; //상수 값은 변수명을 전부 대문자로 하는 것이 규칙!
		final int MIN_NUM; //상수라 하더라도 초기화 되지 않으면 후에 값을 변경할 수 있다. 
		MIN_NUM = 0; 

		//MAX_NUM = 1000; //상수는 값을 변경할 수 없음
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
