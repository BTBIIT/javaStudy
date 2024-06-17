package homework;

import java.util.Scanner;

/************************************
 섭씨를 화씨로 변환하는 메서드를 정의해 보시오.
 	화씨 온도(F) = (섭씨 온도(C) * 1.8) + 32
 => CelToFah(celsius) 메서드 : 섭씨를 화씨로 변환한 후 리턴하는  메서드
 
 
 [출력 예]
 섭씨 입력 : 100
 섭씨 100도 -> 212도
 ************************************/
public class Homework03 {
	// 섭씨를 화씨로 변환하는 메서드
	public static double CelToFah(int celsius) {
		double fah;
		fah = celsius * 1.8 + 32;
		return fah; 
	}
	public static void main(String[] args) {
		int celsius;
		Scanner in = new Scanner(System.in);
		System.out.print("섭씨 입력 : ");
		celsius = in.nextInt();
		
		System.out.printf("섭씨 %d도 -> %.0f도\n",celsius, CelToFah(celsius));
		in.close();
	}

}
