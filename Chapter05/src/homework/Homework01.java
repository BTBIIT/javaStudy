package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// 파라미터 있는 메서드 만들기
		// n1의 n2승 (예시 : 2의 4승) 2 * 2 * 2 * 2
		int n1, n2;
		Scanner in = new Scanner(System.in);
		System.out.print("밑수 입력 : ");
		n1 = in.nextInt();
		System.out.print("지수 입력 : ");
		n2 = in.nextInt();
		in.close();
		
		System.out.printf("%d^%d =%3d\n",n1,n2,power(n1,n2));
		System.out.printf("%d+%d =%3d\n",n1,n2,add(n1,n2));
		System.out.printf("%d-%d =%3d\n",n1,n2,substract(n1,n2));
	}
	
	public static int substract(int n1, int n2) {
		int result = 0;
		result = n1 - n2;
		return result;
	}
	public static int add(int n1, int n2) {
		int result = 0;
		result = n1 + n2;
		return result;
	}
	// 사용할 메서드 생성
	public static Object power(int n1, int n2) {
		int square =1;
		for(int i = 0; i<n2; i++) {		
		//  0		 1			2				3		[square]
		// 2*[1]=2	2*[2]=4		[4]*2=8		[8]*2=16
			square = square * n1;		
		}
		return square;
	}


	

}
