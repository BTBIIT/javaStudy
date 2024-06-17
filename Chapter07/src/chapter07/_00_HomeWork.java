package chapter07;

public class _00_HomeWork {
	// 0~99 사이의 무작위 숫자를 100개 출력 후, 
	// 구간의 개수를 카운트 하는 프로그램을 작성해 보자.
	public static void main(String[] args) {
		int [] array = new int[100];
		int [] count = new int[10];
	
		for(int i=0; i<array.length; i++) {	// 100회 반복
			array[i] = (int)(Math.random()*array.length);	// 0~99까지의 숫자를 출력
			System.out.printf("\t%d", array[i]);	// 숫자 나열

			if(i%10 ==9) {
				System.out.println();	// 숫자 10개마다 줄 바꿈
			}
	
		// 여기에 카운팅하는 코드를 적어주세요.
		/*	
		 array[i] 값이 0~9일땐 count[0]에 10~19일땐 count[1]에 
		 90~99 일땐 count[9]에 넣어주고 싶음
		 array.length = 100 / count.length = 10
		 array[i]/count.length 나눈 값은 0 ~ 9 까지 나올 수 있음
		 array[i]/count.length 값이 0이면 ? 아
		*/	
			count[array[i]%count.length] += 1; // == count[array[i]%10] +=1;
		
		}
				
		System.out.println("================================================================================================");
		
		for(int j = 0; j<count.length; j++) {
		System.out.printf("%s\t~\t%s\t까지의\t정수는 \t%2d개 입니다.",j*count.length,(j*count.length)+9, count[j]);
		System.out.println();
		}

	}
}


