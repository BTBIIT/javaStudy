package ifexample;

import java.util.Scanner;

public class ifElse01 {

	public static void main(String[] args) {
		// 국/영/수 점수 입력 -> 모두 60점 이상이면 : 합격
		// 				아니면(한 과목이라도 60점 미만이면) : 불합격
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 점수를 연속으로 입력해주세요 (공백구분) : ");
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat = in.nextInt();
		in.close();
	// 합격 조건을 선행	
		if (kor >= 60 && eng >= 60 && mat >=60) {
			System.out.println("모든 과목이 60점 이상으로 합격 입니다.");
		} else {
			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
		}
	// 불합격 조건을 선행
		if (kor < 60 || eng < 60 || mat < 60) {
			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
		} else {
			System.out.println("모든 과목이 60점 이상으로 합격 입니다.");
		}
	}

	
	
}
