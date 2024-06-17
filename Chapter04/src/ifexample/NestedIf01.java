package ifexample;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*******************************************************
		 국/영/수 점수를 입력받아 평균 구간 구한 후
		 평균이 60 점 이상, 과락(모두 60점 이상) [합격]
		 평균이 60 점 이상이지만, 과락이 있으면 [불합격]
		 평균이 60 점 미만이면 [평균 미달 불합격]
		 *******************************************************/
		int kor, eng, mat;
		double avg;
		Scanner in = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력(공백구분) : ");
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		in.close();
		avg = (kor + eng + mat) / 3.0;
		
		if(avg>=60) {
			if(kor >= 60 && eng >= 60 && mat >= 60) {
				System.out.print("[합격]");
			} else {
				// 국어
				if (kor < 60) {
					System.out.print("국어 ");
				} 
				// 영어
				if (eng < 60) {
					System.out.print("영어 ");
				}
				// 수학
				if (mat < 60) {
					System.out.print("수학 ");
				}
				// 뒤에 붙는 메세지
				System.out.print("과락으로 [불합격]\n");
			}
		} else {
				System.out.println("전부 [평균미달]");
			}
		}
		
	}


