package homework;

import java.util.Scanner;

public class TransTemperature2 {
	public static void main(String[] args) {
		
		TransTemperature fahrenheit = new TransTemperature();
		double trans;
		Scanner in = new Scanner(System.in);
		System.out.print("섭씨 입력 : ");
		trans = in.nextDouble();
		in.close();
		fahrenheit.TransTemperature(trans);
		System.out.println("섭씨 " + trans + "도 -> " +
				fahrenheit.TransTemperature(trans) + "도");
				
		
	}



}
