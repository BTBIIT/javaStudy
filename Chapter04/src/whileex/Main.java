package whileex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 코스모 소개 프로그램 실습과제
		Scanner in = new Scanner(System.in);
		// 메뉴는 반복되고 중지 가능하므로 조건변수 정함
		boolean inMainMenu = true;
		while(inMainMenu) {
			System.out.println("(I)ntro (C)ourses (E)xit : ");
			//String 형태로 입력받음
			
			switch (in.next()) {
			case "I" :
			case "i" :
				System.out.println("안녕하세요 우리는 코스모입니다. \r\n"
						+ "함께 공부합시다!");
				break;
			
			case "C" :
			case "c" :
				boolean inCourseMenu = true;
				while(inCourseMenu) {
					System.out.println("코스모 수업을 소개합니다. \r\n"
							+ "(J)ava (S)QL (P)ython (B)ack");
					switch(in.next()) {
					case "J":
					case "j":
						System.out.println("Java의 기본 문법과 객체지향 프로그래밍을 배우는 과정입니다.\r\n"
								+ "강사 : 엄호식\r\n"
								+ "추천 선수과목 : 타이핑");
						break;
					case "S":
					case "s" : 
						System.out.println("최신 SQL 연어를 통해 데이터를 조작할 수 있습니다.\r\n"
								+ "강사 : 성시경\r\n"
								+ "추천 선수과목 : Java");
						break;
					case "P" :
					case "p" :
						System.out.println("Python 언어를 통해 데이터사이언스 기초를 배웁니다.\r\n"
								+ "강사 : 강영훈\r\n"
								+ "추천 선수과목 : Java, SQL");
					case "B" :
					case "b" :
						inCourseMenu = false;
						break;
					default :
						System.out.println("다시 입력해 주세요.");
					}
					
				}
				break;
			
			case "E" :
			case "e" :
				System.out.println("안녕히 가세요.");
				inMainMenu = false;
				break;
			default :
				System.out.println("I 나 C 또는 E를 눌러 주세요.");


			}
		}
		
		
		
		in.close();
	}

}
