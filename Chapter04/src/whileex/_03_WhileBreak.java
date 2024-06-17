package whileex;

import java.util.Scanner;

public class _03_WhileBreak {

	public static void main(String[] args) {
		//while, break 예제
		Scanner in = new Scanner(System.in);
		int num;

		
//		while(true) {
//		System.out.print("정수 입력(1~5): ");
//			num = in.nextInt();
//			if(num >= 1 && num <=5 ) {	//while 블럭 탈출 조건
//				break;
//			}
//		}

		do {
			System.out.print("정수 입력(1 ~ 5): ");
			num = in.nextInt();		
		}
		while(num < 1 || num > 5); //반복 조건 : 입력한 수가 1부터 5까지가 아니면
		
		in.close();
		System.out.println("결과는 " + num + " 입니다.");
	}

}
