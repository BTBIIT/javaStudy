package forexample;

public class DoublyForStar02 {
/*#################################
 				i	j	<=	starCnt = i
 								i
 *****			1	5	5 = 6 - 1
 ****			2	4	4 = 6 - 2
 ***			3	3	3 = 6 - 3
 **				4	2	2 = 6 - 4
 *				5	1	1 = 6 - 5
 
     *
    ***
   *****
  *******
 **********

 ##################################*/
	public static void main(String[] args) {
		int starCnt =1;
//		for(int i = 1; i <= 5; i++) {
//			starCnt = 6-i;
//			for(int j = 1; j <= starCnt ; j++) {
//				System.out.printf("*");
//			}	
//			System.out.println();
//		}	
		
		for(int i = 5; i >= 1; i--) {
			starCnt = i;
			for(int j = 1; j <= starCnt ; j++) {
				System.out.printf("*");
			}	
			System.out.println();
		}
	}

}
