package ifexample;

import java.util.Scanner;

public class NestedIf002 {

	public static void main(String[] args) {
	
	
	Scanner in = new Scanner(System.in);
	int testScore; 
	System.out.print("점수 입력 : ");
	testScore = in.nextInt();
	in.close();
	// 조건문 시작
	// testScore가 0 미만 이거나 100을 넘어가는 경우 
	if(testScore < 0 || testScore > 100) {
		System.out.println("잘못된 점수 입력");
		} 
	
	// testScore가 90점 이상이거나 100이하 인경우
	else if(testScore >= 90 && testScore <=100) {
			System.out.println("[90점 이상 : A등급]");
		} 
	
	// testScore가 80점 이상 90점 미만인 경우
	else if(testScore >= 80 && testScore <90) {
			System.out.println("[80점 이상 : B등급]");
		} 
	
	// testScore가 70점 이상 80점 미만인 경우
	else if(testScore >= 70 && testScore <80) {
			System.out.println("[70점 이상 : C등급]");
		} 
	
	// testScroe 60점 이상 70점 미만인 경우
	else if(testScore >= 60 && testScore <70) {
			System.out.println("[60점 이상 : D등급]");
		} 
	
	// testScore가 잘못된 경우, 등급 내 조건이 아닌 경우
	else {
			System.out.println("[60점 미만 : F등급]");
		}
	}	
}


