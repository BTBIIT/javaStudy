package sc;

import java.util.Scanner;

public class _03_Trapezoid {

	public static void main(String[] args) {
		double base, top, height ;
		Scanner in = new Scanner(System.in);
		
//		System.out.print("윗변: ");
//		top = in.nextDouble();
//		
//		System.out.print("밑변: ");
//		base = in.nextDouble();
//		
//		System.out.print("높이: ");
//		height = in.nextDouble();
		System.out.print("윗변 밑변 높이를 연속적으로 입력(공백구분) : ");
		top = in.nextDouble(); base = in.nextDouble(); height = in.nextDouble();
		
		in.close();
		
		double area = (top + base) * height / 2; //사다리꼴 넓이공식
		
		System.out.println("사다리꼴 넓이는 " + area + "입니다");
	}

}
