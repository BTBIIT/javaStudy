package chapter06;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width * height;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// 사각형의 너비와 높이를 입력받아 사각형의 면적을 출력하는 프로그램을 작성하라
		
		Rectangle rect = new Rectangle(); // 객체생성
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사각형의 너비와 높이를 입력(공백 구분)");
		
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea() + " 입니다.");
		
		scanner.close();
		
	}

}
