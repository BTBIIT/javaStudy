package switchcase;

import java.util.Scanner;

public class _03_Switch {

	public static void main(String[] args) {
		/*********************************************** 
		문자를 입력 받아 아래의 메세지를 출력하는 프로그램을 작성해보자
		단 swtich 문으로 작성하시오.
		F 또는 f 입력 시 : File Menu
		H 또는 h 입력 시 : Help Menu
		E 또는 e 입력 시 : Edit Menu
		그 밖의 입력 시 : Error
		[출력 예]
		메뉴 코드 입력 : H 
		Help Menu
		***********************************************/
		char code;
		System.out.print("메뉴 코드 입력: ");
		Scanner in = new Scanner(System.in);
		code = in.nextLine().charAt(0);
		in.close();
		
	switch(code){
		case 'F':
		case 'f':
		
		System.out.println("File menu");
		break;
		case 'H':
		case 'h':
		
		System.out.println("help menu");
		break;
		case 'e':
		case 'E':
		
		System.out.println("Edit menu");
		break;
		default:
		System.out.println("Error");
	}
	}
}
		
//		
//		if (code >= 'a' && code >= 'z') {
//		 code = (char)(code - 32); // (char)(97 - 32) -> A 
//		 }
//		switch(code){
//		case 'F':
//		System.out.println("File menu");
//		break;
//		case 'H':
//		System.out.println("help menu");
//		break;
//		case 'E':
//		System.out.println("Edit menu");
//		break;
//		default:
//		System.out.println("Error");
//		
		
	
		
	

