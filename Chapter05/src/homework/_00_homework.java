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
 2 + 4의 값은 6 입니다.

 [+] 덧셈 [-] 뺄셈 [x] 곱셈 [/] 나눗셈 [^] 지수셈 [E] 종료 // 한번의 기능을 사용 후에는 다시 재 사용으로 돌아감
 -
 뺄셈을 할 숫자 2개를 공백으로 구분하여 입력해주세요 : 2 4
 2 - 4의 값은 -2 입니다.
 
 
 
 *
 */

public class _00_homework {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("x^y 승을 공백을 주어 입력하세요 : ");
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		System.out.println("x^y승의 결과는 " + power(x,y) + " 입니다.");
		
	
	
	}
	
	
	
	
	public static int power(int a, int b) {
		int result = 1;
		for(int i=1; i<=b; i++) {
			result = result * a;
		}
		return result;
	}
}
