package chapter07;

public class _01_MultiArray {

	public static void main(String[] args) {
		// 다차원 배열 3행 4열
		int [][]a = new int[3][4]; 			//		[0]	[1]	[2]	[3]	
		a[1][2] = 99; 						//[0]	0	0	0	0		1행	
		a[2][0] = 123;						//[1]	0	0	99	0		2행
		a[2][3] = a[1][2]+a[2][0];			//[2]	123	0	0	222		3행
											//		1열	2열	3열	4열			
		
		
		System.out.printf("행 갯수 : " + a.length + "\n");
		System.out.printf("열 갯수 : " + a[0].length + "\n");
		
		
		for(int i=0; i<3; i++) {	//행 첨자
				for(int j =0; j<a[i].length; j++) {	//열 첨자
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	
		

	
	
	
	
	
	
	
	
	
	
	
	}

}
