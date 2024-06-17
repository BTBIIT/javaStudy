package ifexample;

import java.util.Scanner;

public class FlooMent {

	public static void main(String[] args) {
		/* 
		층번호를 입력하면
		1층 약국 입니다.
		2층 정형외과 입니다.
		3층 피부과 입니다.
		4층 치과 입니다.
		5층 헬스클럽 입니다.
		이외[]층은 존재하지 않는 층입니다.
		*/
		int floor;
		String ment;
		
		Scanner in = new Scanner(System.in);
		System.out.print("층 번호 입력 : ");
		floor = in.nextInt();
		in.close();
		
		switch(floor) {
		case 1 : ment = "약국";
			break;
		case 2 : ment = "졍형외과";
			break;
		case 3 : ment = "피부과";
			break;
		case 4 : ment = "치과";
			break;
		case 5 : ment = "헬스클럽";
			break;
		default : ment = "존재하지 않는 층";
		}
		System.out.println(floor + "층" + ment + "입니다.");
	}

}
