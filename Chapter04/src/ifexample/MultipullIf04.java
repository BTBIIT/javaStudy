package ifexample;

import java.util.Scanner;

public class MultipullIf04 {

	public static void main(String[] args) {
		/*********************************************** 
		문자를 입력 받아 아래의 메세지를 출력하는 프로그램을 작성해보자
		F 또는 f 입력 시 : File Menu
		H 또는 h 입력 시 : Help Menu
		E 또는 e 입력 시 : Edit Menu
		그 밖의 입력 시 : Error
		[출력 예]
		메뉴 코드 입력 : H 
		Help Menu
		***********************************************/
		Scanner in = new Scanner(System.in);
		System.out.print("메뉴 코드 입력 : ");
		char menu = in.nextLine().charAt(0);
		in.close();
		
		
		if (menu == 'F' || menu == 'f') {
			System.out.println("File Menu");
		} 
		
		else if (menu == 'H' || menu == 'h') {
			System.out.println("Help Menu");
		} 
		
		else if (menu == 'E' || menu == 'e') {
			System.out.println("Edit Menu");
		} 
		
		else {
			System.out.println("Error");
		}
	}

}
