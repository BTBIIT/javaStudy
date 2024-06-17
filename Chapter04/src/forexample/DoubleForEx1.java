package forexample;

public class DoubleForEx1 {

/*	
 	j					출력값	출력위치
 i	0 1 2 3 4 5 6				[j의 인덱스]
 0	0 0 0 0 0 0 7		7			6
 1  0 0 0 0 0 6 0		6  			5
 2  0 0 0 0 5 0 0		5			4
 3  0 0 0 4 0 0 0		4			3
 4  0 0 3 0 0 0 0		3			2
 5  0 2 0 0 0 0 0		2			1
 6	1 0 0 0 0 0 0		1			0
 */
	
	
	
	
	
	
	public static void main(String[] args) {
		for(int i =0; i <7; i++) {
			for(int j =0; j<7; j++) {
				
				if( j == (6-i) ) {
					System.out.printf("%d ", 7-i);
				}else {
					System.out.printf("%d ", 0);
				}
			}
			System.out.println("");
		}
	}

}
