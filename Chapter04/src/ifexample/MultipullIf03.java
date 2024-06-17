package ifexample;

import java.util.Scanner;

public class MultipullIf03 {
	
	public static void main(String[] args) {
		/* 정수 입력 받아 메세지 출력하는 프로그램을 만들어보자
		 1 입력 시 : 가위
		 2 입력 시 : 바위
		 3 입력 시 : 보
		 그 밖에 입력 시 : 오류
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 입력(1/2/3): ");
		int n = in.nextInt();
		in.close();
		
		if (n == 1) {
			System.out.println("가위");
		} 
		
		else if (n == 2) {
			System.out.println("바위");
		} 
		
		else if (n == 3) {
			System.out.println("보");
		} 
		
		else {
			System.out.println("오류");
		}
		
	}
}
