package chapter3;

import java.util.Scanner;

public class OperationTest2 {

	public static void main(String[] args) {
	/* BMI 계산기
	키와 체중을 입력받아 BMI값을 계산하여 출력하라 (BMI는 소수점 한자리까지 표기할 것)
	단, BMI 25를 초과하는 경우 표준체중 이상입니다 메세지를 출력할 것
	(출력예시)
	-----------------------------------
	키 : 177.1
	체중 : 83.0
	-----------------------------------
	BMI : 26.5
	-----------------------------------
	표준체중 이상입니다.
	
	// BMI = 몸무게/(미터화 된 키의 제곱)
	 * ex) 83.0 / (1.771)*(1.771)
	*/
		double height, weight;
		Scanner in = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.print("키 (cm) : ");
		height = in.nextDouble();
		System.out.print("몸무게 (kg) : ");
		weight = in.nextDouble();
		System.out.println("--------------------------------");
		double bmi = weight / ((height/100.0)*(height/100.0));
		System.out.printf("BMI : %.1f\n",bmi);
		System.out.println("--------------------------------");
		in.close();
		
		String bmi_2 ;
		bmi_2 = (bmi > 25) ? "표준체중 이상입니다." : "";
		System.out.println(bmi_2);
		
		
	}

}
