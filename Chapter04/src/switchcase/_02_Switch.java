package switchcase;

import java.util.Scanner;

public class _02_Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = in.nextInt();
		in.close();
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10:  case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2: day = 28;
			break;
		}
		System.out.println(month + "월은 " +  day + "일 까지 있습니다.");
	}

}
