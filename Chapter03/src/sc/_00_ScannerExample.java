package sc;

import java.util.Scanner;

public class _00_ScannerExample {

	public static void main(String[] args) {
		final double DELIVERY = 3500;	// 배송비는 고정
		double price ;					// 물건가격 = 변수
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("물건 가격 : ");
		price = in.nextDouble();		// Input 값
		System.out.println("");
		in.close();						// 수식 종료
		double price_2 = (price * 0.75) + DELIVERY;	// 구매가격
		
		System.out.printf("회원님의 최종 결제금액(배송비 포함)은 %.0f원 입니다", price_2); // output 값
	}

}
