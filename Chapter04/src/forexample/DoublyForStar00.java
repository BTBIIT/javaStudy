package forexample;

public class DoublyForStar00 {
/*#################################
보고자 하는 모양
   *
  ***
 *****
******* 								

for문을 이용해서 할 것.

필요한 변수의 갯수
공백의 숫자	3 2 1 0	
별의 숫자		1 3 5 7

i		starCnt		spaceCnt	별의규칙성		공백 규칙성
1		1			3			2i -1 			4-i
2		3			2			2i -1			4-i
3		5			1			2i -1			4-i
4		7			0			2i -1			4-i
##################################*/
	public static void main(String[] args) {
		int starCnt =  1;
		int spaceCnt = 3; 
		for(int i=1; i<=4; i++) {		// 4회 반복		i가 1일 때 starCnt는 1 spaceCnt는 3 / i가 2일때 starCnt는 2 spaceCnt는 2
			starCnt = (i*2) -1;			// 별의 규칙
			spaceCnt = 4 - i;			// 공백의 규칙
			for(int j = 1; j <= spaceCnt; j++) {	// j가 spaceCnt와 같아질 때 까지 반복	즉 j가 공백의 규칙과 동일해질때까지 반복
				System.out.print(" ");
			} 
			for(int k = 1; k <=2*i -1; k++) {		// k가 별의 규칙과 동일해질때까지 k를 1씩 증가시키며 아래 코드를 반복
			System.out.print("*");
			}
					
			System.out.println("");
		}
	}

}
