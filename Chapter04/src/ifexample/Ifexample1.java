package ifexample;

import java.util.Scanner;

public class Ifexample1 {

	public static void main(String[] args) {
		// 나이에 따라 다른 문장 출력하기
		Scanner in = new Scanner(System.in);
		System.out.print("나이를 숫자로 입력해 주세요: ");
		int age = in.nextInt();
		
		in.close();
		
		// if 문 시작
		if(age >=8) {
			System.out.println("학교에 다닙니다.");	// age가 8 이상이면 출력
		} else {
			System.out.println("학교에 다니지 않습니다.");	// 8 미만이면 출력
		}	
		// if문 종료
		
		
		char gender = 'F';
		// 만약에 gender가 'F'라면 여성입니다, 아닐경우 남성입니다 출력하는 if문
		if(gender == 'F') {
			System.out.println("여성 입니다.");
		} else {
			System.out.println("남성 입니다.");
		}
		
	

	}

}
