package switchcase;

import java.util.Scanner;

public class _04_Switch {
	public static void main(String[] args) {
	
	char code;
	System.out.print("영문자 입력 입력: ");
	Scanner in = new Scanner(System.in);
	code = in.nextLine().charAt(0);
	in.close();
	
	if (code >= 'a' && code <= 'z') {
	 code = (char)(code - 32); // (char)(97 - 32) -> A 
	 }
	switch(code){
	case 'A': case 'E': case 'I': case '0': case 'U':
	System.out.println("모음입니다.\n");
	break;
	default:
	if (code >= 'A' && code <= 'Z') {
		System.out.print("자음 입니다.\n");
	} else {
	System.out.println("영문자가 아닙니다.\n");
	}
}
	}
}