package homework;

import java.util.Scanner;
/*
 계산기 만들기
 
 + 버튼을 누르면 덧셈을
 - 버튼을 누르면 뺄셈을
 x 버튼을 누르면 곱셈을
 / 버튼을 누르면 나눗셈을
 ^ 버튼을 누르면 지수셈을 하는 계산기를 만들기
 
 [출력예]
 사용하실 기능을 눌러주세요
 [+] 덧셈 [-] 뺄셈 [x] 곱셈 [/] 나눗셈 [^] 지수셈 [E] 종료
 +
 덧셈을 할 숫자 2개를 공백으로 구분하여 입력해주세요 : 2 4
 2 4의 덧셈은 6 입니다.

 [+] 덧셈 [-] 뺄셈 [x] 곱셈 [/] 나눗셈 [^] 지수셈 [E] 종료 // 한번의 기능을 사용 후에는 다시 재 사용으로 돌아감
 -
 뺄셈을 할 숫자 2개를 공백으로 구분하여 입력해주세요 : 2 4
 2 4의 뺄셈은 -2 입니다.
 
 * Scanner, while switch 기능을 사용할 것
 * 각 계산은 매서드를 사용할 것
 
 *
 */

public class _00_homework2 {

	public static void main(String[] args) {
	// 계산기 프로그램 생성
	Scanner in = new Scanner(System.in);
	boolean inMenu = true;
	while(inMenu) {
	
		System.out.print("사용하실 기능을 눌러주세요\n" +
		"[+] 덧셈   [-] 뺄셈   [x] 곱셈   [/] 나눗셈   [^] 지수셈   [E] 종료 : ");
	
	switch(in.next()) {
	case "+" : 
		System.out.print("덧셈을 할 숫자 2개를 공백으로 구분하여 입력해 주세요.");
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		System.out.printf("%d와 %d의 덧셈은 : %d 입니다.\n",p1,p2,plus(p1,p2));
		System.out.println("");
		break;
	case "-":
		System.out.print("뺄셈을 할 숫자 2개를 공백으로 구분하여 입력해 주세요.");
		int m1 = in.nextInt();
		int m2 = in.nextInt();
		System.out.printf("%d와 %d의 뺄셈은 : %d 입니다.\n",m1,m2,minus(m1,m2));
		System.out.println("");
		break ;
	case "x" :
	case "X" :
		System.out.printf("곱셈을 할 숫자 2개를 공백으로 구분하여 입력해 주세요.");
		int mu1 = in.nextInt();
		int mu2 = in.nextInt();
		System.out.printf("%d와 %d의 곱셈은 : %d 입니다.\n",mu1,mu2,multiplication(mu1,mu2));
		break ;
	case "/" :
		System.out.printf("나눗셈을 할 숫자 2개를 공백으로 구분하여 입력해 주세요.");
		int dvs1 = in.nextInt();
		int dvs2 = in.nextInt();
		double dvs3 = (double) dvs1 ;
		double dvs4 = (double) dvs2 ;
		System.out.printf("%.0f와 %.0f의 나눗셈은 %.5f 입니다.\n",dvs3,dvs4,division(dvs3, dvs4));
		break;
	case "^" :
		System.out.printf("밑수와 지수를 공백으로 구분하여 입력해 주세요. ");
		int ba = in.nextInt();
		int fa = in.nextInt();
		System.out.printf("%d의 %d 승은 %d 입니다.\n",ba,fa,exponent(ba, fa));
		break;
	case "e" :
	case "E" :
		System.out.println("안녕히 가세요.");
		inMenu = false;
		break;
	default :
		System.out.println("주어진 기호를 눌러주세요.");
	}
	}
	
	
	
	
	
	in.close();
	
	
	}
	
	
	
// 지수 계산기	
	public static int exponent (int base, int factor) {
		int result = 1;
		for(int i=1; i<=factor; i++) {
			result = result * base;
		}
		return result;
	}
// 덧셈 계산기
	public static int plus (int plus1, int plus2) {
		int result = 0;
		result = plus1 + plus2;
		return result;
	}
// 뺄셈 	계산기
	public static int minus(int minus1, int minus2) {
		int result = 0;
		result = minus1 - minus2;
		return result;
	}
// 곱셈 계산기
	public static int multiplication (int multi1, int multi2) {
		int result = 0;
		result = multi1 * multi2;
		return result;
	}
// 나눗셈 계산기
	public static double division (double dv1, double dv2) {
		double result = 0;
		result = dv1 / dv2;
		return result;
	}

}
