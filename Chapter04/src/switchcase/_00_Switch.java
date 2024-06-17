package switchcase;

import java.util.Scanner;

public class _00_Switch {

	public static void main(String[] args) {
		/**************************************
		 시간당 급여 : 10000원
		 야간 근무 시 : 시간 당 급여 * 1.5
		 근무 시간을 입력 받아 급여를 출력 하시오.
		[출력 예]
		월 총 근무 시간 : 100
		주간 근무 시 '1', 야간 근무 시 '2' 입력 : 2
		
		당신의 이번 달 총 급여는 1500000원 입니다.
		
		필요한 변수
		근무시간, 근무 타입, 총 급여 최소 3개의 변수가 필요함
		
		 **************************************/
		int time;
		int type;
		int pay = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("월 총 근무 시간 : ");
		time = in.nextInt();
		System.out.print("주간 근무 시 '1', 야간 근무 시 '2' 입력 : ");
		type = in.nextInt();
		in.close();
		
		
		
		System.out.println("");
/***************************************************************
//		swith 사용으로 계산 시 방법

		switch(type) {
		case 1:
			pay = (time * 10000);
			
			break;
		case 2:
			pay = (time * 15000);
			break;
		default:
			System.out.println("주 야간 근무 번호를 다시 확인해 주십시오.");
		}
		
		System.out.println("당신의 이번 달 총 급여는 " + pay + "원 입니다.");
		
		line 36,53,54 주석을 삭제하고 사용.
***************************************************************/		
//		조절연산자를 사용할 경우		

		pay = (type == 1) ?  (time * 10000) : (time * 15000);
		System.out.println("당신의 이번 달 총 급여는 " + pay + "원 입니다.");
//		코드 종료
	}

}
