package forexample;

public class DoublyForStar03 {
/*#################################
 				i	$		$dollarCnt	* 1개
 								
$$$$*			1	4	=	5 - i	
$$$*			2	3	=	5 - i
$$*				3	2	=	5 - i
$*				4	1	=	5 - i
*				5	0	=	5 - i


				i	$	=	$dollarCnt = 5 - i  * 별 갯수 sCnt = 2*i - 1
$$$$*			1	4	=	5 - i				1	=	2*i -1
$$$***			2	3	=	5 - i				3	=	2*i -1
$$******		3	2	=	5 - i				5	=	2*i -1
$********		4	1	=	5 - i				7	=	2*i -1
*********		5	0	=	5 - i				9	=	2*i -1
##################################*/
	public static void main(String[] args) {
		int dollarCnt =4;
		int sCnt = 1;
		for(int i = 1; i <= 5; i++) {	//첫번째 for문 시작	i의 시작과 끝
			dollarCnt = 5-i;			//규칙성의 자리
			sCnt = 2 * i -1;
			for(int j = 1; j <= dollarCnt ; j++) {	//1부터 규칙성 전까지의 반복
				System.out.printf(" ");
			}
			for(int k =1; k<=sCnt; k++) {
				System.out.print("*");			// 끝에 *을 넣어줌	
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
