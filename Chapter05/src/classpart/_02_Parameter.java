package classpart;

import java.util.Scanner;

public class _02_Parameter {

	public static void main(String[] args) {
		// 파라미터 있는 메서드 만들기
		Scanner in = new Scanner(System.in);
		System.out.print("두 수 입력 (공백으로 구분) : ");
		int n1, n2;
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		getSum(n1,n2); // 함수를 사용할 때 메서드를 호출

		
		
		
	}
	// 사용할 메서드 생성
	public static void getSum(int x, int y) {
		System.out.println("두 수 의 합은 " + (x+y) + " 입니다.");
	}
	

}
