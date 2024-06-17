package ifexample;

import java.util.Scanner;

public class ifElse04 {

	public static void main(String[] args) {
		// 두 개의 정수를 입려받아 나눗셈의 몫과 나머지를 출력하는 프로그램을 작성해보자
		// 나누는 수(제수)가 0인 경우 "0으로 나눌 수 없습니다." 라고 메세지를 출력한다.
		// [출력 예]
		// 2개의 정수 입력 : 3 0
		// 0으로 나눌 수 없습니다.
		
		Scanner in = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력해주세요(공백 구분): ");
		int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.close();
		
		// num2가 나누는 쪽이기 때문에 0이 아닌경우일 때 몫과 나머지를 출력하는 코드
		if (num2 != 0) {
			System.out.println("몫: " + (num1/num2) + ", 나머지: " + (num1 % num2));
		} else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
	}

}
