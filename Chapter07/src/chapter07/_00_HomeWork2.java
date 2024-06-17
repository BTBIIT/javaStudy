package chapter07;

public class _00_HomeWork2 {
	// 0~99 사이의 무작위 숫자를 100개 출력 후, 
	// 구간의 개수를 카운트 하는 프로그램을 작성해 보자.
	public static void main(String[] args) {
		int [] array = new int[100];
		int [] count = new int[10];
	
		for(int i=0; i<array.length; i++) {	// 100회 반복
			array[i] = (int)(Math.random()*array.length);	// 0~99까지의 숫자를 출력
			System.out.printf("\t%d", array[i]);	// 숫자 나열
			
			// 강사님 답
			for(int j=0; j<count.length; j++) {
				if(array[i]/10 ==j) {
					count[j] +=1;
				}
			}
			
			
			if(i%10 ==9) {
				System.out.println();	// 숫자 10개마다 줄 바꿈
			}
	}
				
		System.out.println("================================================================================================");
		
		for(int j = 0; j<count.length; j++) {
		System.out.printf("\t%s\t~\t%s\t까지의\t정수는 \t%2d개 입니다.",j*count.length,(j*count.length)+9, count[j]);
		System.out.println();
		}

	}
}


