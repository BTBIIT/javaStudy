package ifexample;

import java.util.Scanner;

public class ifElse03 {

	public static void main(String[] args) {
		// 나이와 내공을 입력받아 고스톱 게임의 초보 채널 입장 여부 판별 프로그램 작성
		// [입장 가능 조건] 나이 : 18세 이상, 내공 : 1400 ~ 1600
		// 이 조건이 맞지 않은 경우는 입장이 불가능 하다.
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = in.nextInt();
		
		System.out.print("내공 : ");
		int level = in.nextInt();
		in.close();
		
		// 나이와 내공 두 개의 변수가 조건을 만족해야하므로, 조건인 18살 이상, 1400~1600의 내공에 대한 조건을 걸어줌.
		if(age >=18 && level >=1400 && level <=1600) {
			System.out.println("입장 가능");
		} else {
			System.out.println("입장 불가능");
		}
	}

}
