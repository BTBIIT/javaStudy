package chapter3;

import java.util.Scanner;		// Scanner 기능을 사용하기 위해 import하여 사용

public class OperationExTest {
		// 물건 값과 지불액을 입력받아 거스름돈을 구하는 프로그램을 작성하시오. 
		// 이때 거스름돈을 금액 단위별로 출력하라.
		// 단, '지불액이 물건 값보다 적은 경우는 없다'라고 가정한다.
/*
 	거스름돈 : 2920원
 	-----------------------------------------------
 	1000원 2개
 	500원 1개 (거스름돈 % 상위단위금액) / 해당금액
 	100원 4개 (거스름돈 % 상위단위금액) / 해당금액
 	10원 2개 (거스름돈 % 상위단위금액) / 해당금액
 */
	public static void main(String[] args) {
		
		double price, moneyPaied ; // 필요한 변수 생성 <물건가격, 지불금액>
		
		// 키보드 상에서 입력 받는 부분 시작
		Scanner in = new Scanner(System.in);	// 이 기능을 사용하기 위해 import java.utill.Scanner를 사용
		System.out.print("물건 가격 입력: ");
		price = in.nextDouble();
		System.out.print("지불 금액 입력: ");
		moneyPaied = in.nextDouble();
		in.close();
		// 키보드 상에서 입력 받는 부분 끝
		
		int diff; // 거스름돈 변수 생성
		diff = (int) (moneyPaied - price) ; // 거스름돈 생성 (지불액은 물건 값보다 적은 경우는 없음)
		System.out.println("-------------------------------------");
		System.out.printf("거스름 돈 : %d원\n",diff);	// 거스름돈 출력
		System.out.println("-------------------------------------");
		
		// 필요한 변수의 수 = 지폐, 잔돈 수 (만원, 오천원, 천원, 오백원, 백원, 십원)
		int manWon, ochenWon, chenWon, obaegWon, baegWon, sibWon; // 잔돈 변수 생성
		
		
		manWon = diff / 10000;				// 만원짜리 갯수
		diff = diff - (10000 * manWon);		// 만원짜리를 제외한 차액

		ochenWon = diff / 5000;				// 오천원짜리 갯수
		diff = diff - (5000 * ochenWon);	// 오천원짜리를 제외한 차액
		
		chenWon = diff / 1000;				// 천원짜리 갯수 
		diff = diff - (1000 * chenWon);		// 천원짜리를 제외한 차액
		
		obaegWon = diff / 500;				// 오백원짜리 갯수
		diff = diff - (500 * obaegWon);		// 오백원짜리를 제외한 차액
		
		baegWon = diff / 100;				// 백원짜리 갯수
		diff = diff - (100 * baegWon);		// 백원짜리를 제외한 차액
		
		sibWon = diff / 10;					// 십원짜리 생성
		
		// 지폐를 높은 순에서 낮은 순 으로 간 이유 : 낮은 순에서 시작하면 높은 지폐에 몫이 떨어지지 않으므로
		// ex) 5000원 = 5000원짜리 1장 = 1000원짜리 5장 = 500원짜리 10장...과 같음  
		
		System.out.println("10000원 : " + manWon + "개");		// 만원짜리 출력
		System.out.println("5000원 : " + ochenWon + "개");	// 오천원짜리 출력
		System.out.println("1000원 : " + chenWon + "개");		// 천원짜리 출력
		System.out.println("500원 : " + obaegWon + "개");		// 오백원짜리 출력
		System.out.println("100원 : " + baegWon + "개");		// 백원짜리 출력
		System.out.println("10원 : " + sibWon + "개");		// 십원짜리 출력
		
	}
	
}
