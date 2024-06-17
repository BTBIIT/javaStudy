package ifexample;

import java.util.Scanner;

public class MultipullIf02 {

	public static void main(String[] args) {
		/***********************************************************
		 두 수를 입력 받아 두 수 중 큰 수와 작은 수를 출력하는 프로그램을 작성해보자.
		 같은 수 입력 시 "두 수는 같습니다" 라는 메세지를 출력
		 [출력 예]
		 두 수 입력 (공백 구분) : 3 5
		 두 수 중 큰 수는 5이며, 작은 수는 3입니다.
		
		 두 수 입력 (공백 구분) : 3 3
		 두 수는 같습니다.
		 ************************************************************/
		Scanner in = new Scanner(System.in);
		System.out.print("두 수 입력 (공백구분) : ");
		int n1, n2;
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		// n1이 n2보다 큰 경우
		if (n1>n2) {
			System.out.println("두 수 중 큰 수는 " + n1 + "이며, 작은 수는 " + n2 +"입니다.");
		} 
		// n2가 n1보다 큰 경우
		else if (n2>n1)
			System.out.println("두 수 중 큰 수는 " + n2 + "이며, 작은 수는 " + n1 +"입니다.");
		// n1과 n2의 크고 작음을 확인할 수 없는 경우
		else {
			System.out.println("두 수는 같습니다.");
		}
		
	}

}
