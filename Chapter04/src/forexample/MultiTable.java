package forexample;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		int d, n;
		int begin, end, temp;
		System.out.print("구구단 시작 단 입력 : ");
		Scanner in = new Scanner(System.in);
		begin = in.nextInt();
		System.out.print("구구단의 끝 단 입력 : ");
		end = in.nextInt();
		in.close();
		
		if(begin > end) {
			temp = begin ;
			begin = end;
			end = temp;
			System.out.println("시작단이 끝단보다 큰 경우 두 개 값을 교환 처리합니다. ");
		}
		
		
		
		// 구구단 출력
		System.out.println("\n\n ## 가로 구구단 ## \n");
		for(d = begin; d <= end; d++) {	// 단 : d
			System.out.printf("%d단 : ",d);
			for(n = 1; n <= 9; n++) {	//	 곱하는 수 : n
				System.out.printf("%d X %d = %2d  ",d,n,d*n);	
			}
			System.out.println();
		}
		// 세로 구구단 출력
		System.out.println("\n\n ## 세로 구구단 ## \n");
		for(n = 1; n <= 9; n++) { // 곱하는 수 : n
			for(d = begin; d <= end; d++) {
				System.out.printf("%d X %d = %2d  ",d,n,d*n);
			}
			System.out.println();
		}
	}

}
