package forexample;

import java.util.Scanner;

/**********************************************

lineCnt =4
			i		달러수(dCnt)		별갯수(starCnt)
					=라인수-i			i ++2
$$$*		1		3				1
$$***		2		2				3
$*****		3		1				5
*******		4		0				7

**********************************************/


public class Exercise04 {

	public static void main(String[] args) {
		// 별삼각형 그리기
		Scanner in = new Scanner(System.in);
		System.out.print("별 라인 수 입력 : ");
		int lineCnt = in.nextInt();
		in.close();
		
		
		
		int dCnt = lineCnt-1;
		int starCnt = 1;
		
		for(int i =1; i<=lineCnt; i++) {
			for(int j = 1; j<=dCnt; j++) {
				System.out.print("$");
				
			}for(int k = 1; k<=starCnt; k++) {
				System.out.print("*");
			}
			
			dCnt = dCnt -1;
			starCnt = starCnt +2;
			System.out.println();
		}
		
	}

}
