package chapter07;

public class _02_MultiTable {

	public static void main(String[] args) {
		//	구구단
		// 원하는 output 
		//	[0]	[1]	[2]	[3]	[4]	[5]	[6]	[7]	[8]
		//	2	4	6	8	10	12	14	16	18
		//	...
		//	9	18	27	36	45	54	63	72	81
		
	
	int[][] table = new int[8][9];
	
	for(int i=0 ; i<table.length; i++) {
		for(int j=0; j<table[i].length; j++) {
			table[i][j] = (i+2) * (j+1);
			System.out.print(table[i][j] + "\t");
		}
		System.out.println();
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
