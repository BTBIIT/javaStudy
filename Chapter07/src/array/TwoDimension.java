package array;

public class TwoDimension {

	public static void main(String[] args) {
		System.out.println("------------------------------------------");
		// 2차원 배열 초기화하기
		int[][] arr = 	{{1,2,3},
						{4,5,6}};
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");	//한 줄 출력 후 한 줄 띄움
		}

		
		//알파벳 소문자를 13행 2열로 나타내고싶음
		// 알파벳 소문자를 13행 2열로 출력하는 프로그램을 이차원 배열로 구현해 보세요
System.out.println("------------------------------------------");
		char[][] alphabets = new char[13][2];
		char ch = 'a';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
System.out.println("------------------------------------------");		
		char[][] alphabets2 = new char[2][13];
		char ch2 = 'a';
		
		for(int i = 0; i<alphabets2.length; i++) {
			for(int j = 0; j<alphabets2[i].length; j++) {
				alphabets2[i][j] = ch2;
				System.out.print(alphabets2[i][j] + " ");
				ch2++;
			}
			System.out.println();
		}
System.out.println("------------------------------------------");	
char[][] alphabets3 = new char[2][26];
char ch3 = 'a';
//char ch3 = 'z';
//System.out.println((int) ch3);

for(int i =0; i<alphabets3.length; i++) {
	for(int j = 0; j<alphabets3[i].length; j++) {
		alphabets3[i][j] = ch3;
		System.out.print(alphabets3[i][j] + " ");
		ch3++;
	}
	ch3 = (char)(alphabets3[0][0]-32);
	System.out.println();
}
	
	
	
	}

}
