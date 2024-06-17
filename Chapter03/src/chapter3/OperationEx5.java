package chapter3;

import java.util.Scanner;

public class OperationEx5 {
	
	
			
	public static void main(String[] args) {
	
	int a = 10;
	int b = 3;
	double re = (double)(a/b); // 괄호 유무에 따라 순서가 바뀜 / a/b를 먼저 계산 한 후 double로 변경 
	System.out.println(re);
	double d = (double)a / b; // -> 순서대로
	System.out.println(d);
	
	// 두 수 입력받아 조건연산자 사용
	// 두 수 중 큰 수는 몇입니다 출력
	Scanner in = new Scanner(System.in);
	int num1, num2;
	System.out.print("두 수 입력 (공백으로 구분)");
	num1 = in.nextInt();
	num2 = in.nextInt();
	in.close();
	
	int bigNum;
	bigNum = (num1 > num2) ? num1 : num2;
	
	System.out.println("두 수 중 큰 수는 " + bigNum +"입니다");
	
	}

}
