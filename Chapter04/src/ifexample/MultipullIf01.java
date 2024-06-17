package ifexample;

import java.util.Scanner;

public class MultipullIf01 {

	public static void main(String[] args) {
		/*****************************************
		 국/영/수 점수를 입력받아 평균을 구한 후,
		 	평균이 90점 이상이면 A등급
		 	평균이 80점 이상이면 B급
		 	평균이 70점 이상이면 C등급
		 	평균이 60점 이상이면 D등급
		 	그 밑이면 F등급
		 [출력 예] 평균 %.2f로 %c등급입니다.
		 *****************************************/
		// 키보드 상에서 입력하는 부분 시작
		Scanner in = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수를 입력해주세요(공백구분) : ");
		int kor, eng, mat;
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		in.close();
		// 키보드 상에서 입력하는 부분 종료
		
		double avg = (kor+eng+mat) / (3.0); // 평균 변수 선언
		char grade;		// 등급 변수 선언
																			
		if (avg >= 90) {											// 평균이 90 이상일 경우 시작//
			grade = 'A';											// 평균이 90 이상일 경우 종료//
		} else if(avg < 90 && avg >= 80) {							// 평균이 89 ~ 80일 경우 시작//
			grade = 'B';											// 평균이 89 ~ 80일 경우 종료//
		} else if(avg < 80 && avg >= 70) {							// 평균이 79 ~ 70일 경우 시작//
			grade = 'C';											// 평균이 79 ~ 70일 경우 종료//
		} else if(avg < 70 && avg >= 60) {							// 평균이 69 ~ 60일 경우 시작//
			grade = 'D';											// 평균이 69 ~ 60일 경우 종료//
		} else {													// 평균이 60 미만일 경우 시작//
			grade = 'F';											// 평균이 60 미만일 경우 종료//
		}
		
		System.out.printf("평균은 %.2f로 %c등급입니다",avg,grade);		// 최종 출력 	
	}

}
