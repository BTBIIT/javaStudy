package forexample;

public class DoublyFor04 {
/*=========================================
 규칙성 찾기
				i		j		<=	limit = j
1				1		
00				2
111				3
0000			4
11111			5
000000			6
1111111			7
00000000		8
111111111		9
 =========================================*/
	public static void main(String[] args) {
		
		int limit =1;
		
		for(int i = 1; i <= 9; i++) {
			limit = i;
			for(int j = 1; j <= limit ; j++) {
				System.out.print(i%2);
//				if (i%2==1) {
//					System.out.print(1);
//				}else {
//					System.out.print(0);
//				}
			} 	
			
			System.out.println();
		}
	}

}
