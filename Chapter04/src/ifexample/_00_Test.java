package ifexample;

import java.util.Scanner;

public class _00_Test {

	public static void main(String[] args) {

		String bloodType1 = "AB"; // ABO식 AB형때문에 String형식으로 설정
		String bloodType1_1 = "ab";
		
		
		String bloodType2 = null;
		
		
		char bloodType3 ; // Rh식
		Scanner in = new Scanner(System.in);
		System.out.print("당신의 ABO 혈액형을 입력하세요 : "); 
		bloodType2 = in.nextLine();
		System.out.print("당신의 Rh 혈액형을 입력하세요 : ");
		bloodType3 = in.nextLine().charAt(0);
		in.close();
		
		if(bloodType2.equals(bloodType1)) {
			if(bloodType3 == '-' || bloodType3 == '+') {
				System.out.println("당신은 "+ bloodType2 + "("+bloodType3+")입니다.");
			} else {
				System.out.println("당신의 혈액형은 알 수 없습니다.");
			} 
		} 
		
		else if (bloodType2.equals(bloodType1_1)) {
			System.out.println("당신은 "+ bloodType1 + "(Rh"+bloodType3+")입니다.");
		} 
		
		else if (bloodType2.equals("A") || bloodType2.equals("a")) {
			if (bloodType3 == '-' || bloodType3 == '+') {
				System.out.println("당신은 A(Rh"+bloodType3+")입니다.");
			} 
			else {
				System.out.println("당신의 혈액형은 알 수 없습니다.");
			}
			
	
	}	else if (bloodType2.equals("B") || bloodType2.equals("b")) {
		if (bloodType3 == '-' || bloodType3 == '+') {
			System.out.println("당신은 B(Rh"+bloodType3+")입니다.");
		} 
		else {
			System.out.println("당신의 혈액형은 알 수 없습니다.");
		}
	}	else if (bloodType2.equals("O") || bloodType2.equals("o")) {
		System.out.println("당신은 O(Rh"+bloodType3+")입니다.");
	} else {
		System.out.println("당신의 혈액형은 알 수 없습니다.");
	}

}
}

		
	
	


