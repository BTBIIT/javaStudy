package ifexample;

import java.util.Scanner;

public class ifElse02 {

	public static void main(String[] args) {
		// 정수를 입력 받아 짝수/홀수를 판별하는 코드를 작성하시오.
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int num = in.nextInt();
		in.close();
		
		// 입력받은 정수를 2로 나눈 후 나머지로 짝수 홀수 비교
		if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수 입니다");
		} else {
			System.out.println(num + "은(는) 홀수 입니다");
		}
	}

}
