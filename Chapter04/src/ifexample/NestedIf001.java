package ifexample;

import java.util.Scanner;

public class NestedIf001 {

	public static void main(String[] args) {
		int baesu;
		System.out.print("정수 입력 : ");
		Scanner in = new Scanner(System.in);
		baesu = in.nextInt();
		in.close();
	// 조건문 시작	
		
		// 6은 2와 3의 최소공배수이므로 6으로 나머지가 0이면 무조건 2와 3의 배수
		if(baesu%6 == 0) {	
			System.out.println(baesu + "은(는) 2의 배수 이면서, 3의 배수 입니다.");
		} 
		
		//	3의 나머지는 0이지만 2의 나머지가 0이 아닌경우
		else if(baesu%3 == 0 && baesu%2 != 0) {
			System.out.println(baesu + "은(는) 3의 배수 입니다.");
		} 
		// 2의 나머지는 0이지만 3의 나머지가 0이 아닌경우
		else if(baesu%2 == 0 && baesu%3 != 0) {
			System.out.println(baesu + "은(는) 2의 배수 입니다.");
		} 
		// 6의 배수, 3의 배수, 2의 배수를 제외한 경우
		else {
			System.out.println(baesu + "은(는) 2의 배수도, 3의 배수도 아닙니다.");
		}
		
	
	}

}
