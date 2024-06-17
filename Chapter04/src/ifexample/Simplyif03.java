package ifexample;

import java.util.Scanner;

public class Simplyif03 {

	public static void main(String[] args) {
		// 영문자를 입력 받아서
		// 대문자라면? 대문자로 출력
		// 소문자라면? 대문자로 변환해서 대문자로 출력
		Scanner in = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char alpha = in.next().charAt(0);
		in.close();
		
		// 범위 && 연산자를 쓴다.
		if(alpha >= 'a' && alpha <= 'z') {	// 소문자인 경우는?
			alpha = (char)(alpha - 32);
			System.out.println("소문자를 대문자로 변환합니다.");
		} 
			System.out.println("결과는 " + alpha + "입니다.");
	
	}

}
