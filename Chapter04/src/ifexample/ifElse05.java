package ifexample;

import java.util.Scanner;

public class ifElse05 {

	public static void main(String[] args) {
		// 주민번호 입력 받아 성별을 판별하는 프로그램을 작성해보자
		/*
		 남자 : 뒷 번호 첫 자리가 1 or 3
		 여자 : 뒷 번호 첫 자리가 2 or 4
		 [출력 예]
		 주민 등록 번호 입력( ex.040722-3045810) : 020430-3045810
		 당신은 남자 입니다. or 당신은 여자 입니다.
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("주민 등록 번호 입력( ex.040722-3045810) : "); 
		char check;
		
		//주민번호 뒷자리에서 첫번째 자리가 1이나 3이면 남자, 2나 4이면 여자
		// 040722-3045810
		// [0123456789....순서이므로 8번째 문자는 7]
		check = in.nextLine().charAt(7);
		in.close();
		
		//주민번호 뒷자리에서 첫번째 자리가 1이나 3이면 남자
		if(check == '1' || check =='3') {
			System.out.println("당신은 남자 입니다.");
		} 
		// 주민번호 뒷자리에서 첫번째 자리가 2이나 3이면 여자
		else {
			System.out.println("당신은 여자 입니다.");
		}
	
	}

}
