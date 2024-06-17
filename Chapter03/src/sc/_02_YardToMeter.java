package sc;

import java.util.Scanner;

public class _02_YardToMeter {

	public static void main(String[] args) {
		final double ONE_YARD = 0.9144;
		
		System.out.print("야드 입력: ");
		
		Scanner in = new Scanner(System.in);	//입력 준비 A a = new A(System.in);
		double yard = in.nextDouble();
		
		in.close();								//입력 완료
		double meter = yard * ONE_YARD;
		System.out.println(yard + "yard는 " + meter + "미터 입니다.");
	}

}
