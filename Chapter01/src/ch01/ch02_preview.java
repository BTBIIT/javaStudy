package ch01;

public class ch02_preview {
	public static void main(String[ ] args) {
		int level; //정수형 변수 level을 선언 
		level = 10; //level 변수에 값 10을 대입
		System.out.println(level); //level 값 출력
		
		int level_2;
		level_2 = 31;
		System.out.println(level_2);
		
		int num = 10;
		int bNum = 0B1010; //0B : 2진수로 표현
		int oNum = 012; // 0 : 8진수 표현
		int hNum = 0XA; // 0X : 16진수 표현
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011;
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2 ;
		System.out.println(sum);
		char Name_1 = 'A';
		System.out.println(Name_1);
		String ABC = "박건혁";
		System.out.println(ABC);
	
		
	}
}