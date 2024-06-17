package forexample;

import java.util.Scanner;

public class Exercise05 {
/*====================================================================================
				lineCnt=7	spaceCnt(dCnt)						starCnt
					i			lineCnt/2 = 3					
								(+) (lineCnt/2 + 1) - i
								(-) i - (lineCnt/2 + 1)
$$$*				1			3 = 4-i							1 = 2*i -1
$$***				2			2 = 4-i							3 = 2*i -1
$*****				3			1 = 4-i							5 = 2*i -1
*******				4			0 = 4-i							7 = 2*i -1
$*****				5			1 = i-4							5 = starCnt -2 = starCnt-=2
$$***				6			2 = i-4 	 					3 = starCnt -2 = starCnt-=2
$$$*		 		7			3 = i-4							1 = starCnt -2 = starCnt-=2

=======================================================================================*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lineCnt;
/*		
 * 		do {
			System.out.print("줄 수를 입력하세요 : ");	
			lineCnt = in.nextInt();
		}while(lineCnt%2==0);
*/		
		while(true){
			System.out.print("마름모 줄 수를 입력하세요(홀수 입력) : ");	
			lineCnt = in.nextInt();	
			if(lineCnt%2 ==1) {
				break;
			}else {
				System.out.print("홀수 입력값인지 확인하세요!!");
			}
		}

		
		
		
		in.close();
		
		//마름모출력
		
		int spaceCnt = lineCnt/2;
		int starCnt = 1;
		
		for(int i = 1; i <= lineCnt; i++) {
			
			if(i<=lineCnt/2+1) {			//	중간 라인까지
				spaceCnt = (lineCnt/2+1)- i ;
				starCnt = 2*i -1;
			}else {							//	중간 이후 라인부터 끝까지
				spaceCnt = spaceCnt +1 ;
				starCnt = starCnt -=2;		// starCnt -2
			}
			//$$$ $$ $
			for(int j = 1; j <= spaceCnt; j ++) {
				System.out.print(" ");
			}
			//$$$* $*** $******
			for(int k = 1; k <= starCnt; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
