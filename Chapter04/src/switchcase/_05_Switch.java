package switchcase;

import java.util.Scanner;

public class _05_Switch {

	public static void main(String[] args) {
		// 짝수 홀수 판별
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = in.nextInt();
		in.close();
		
		switch(num%2) {
		case 0:
			System.out.println(num + "은(는) 짝수 입니다.");
			break;
		default :
			System.out.println(num + " 은(는) 홀수 입니다.");
		}
	}

}
