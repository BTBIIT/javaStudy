package chapter07;

public class _02_Average {

	public static void main(String[] args) {
		// 배열 이용 평균 구하기
		int [] num = new int[100];
		int total = 0;
		for(int i=0; i<num.length; i++) { //배열에서 실수를 줄이기 위해 배열 길이를 측정할 수 있는 length라는 것이 있음.
			
			num[i] = (int)(Math.random()*10); //0부터 9까지 랜덤한 값을 넣어주고 싶음
			total += num[i]; // 저장된 점수를 누적함
			System.out.printf("%4d", num[i]);
			if(i%10 == 9) {			// 나머지가 9일 경우 개행문자 출력
				System.out.println();
			}
		}
		System.out.println("\n정수 100개의 평균은 " + 
							(double) total/num.length + "입니다."); //배열에서 실수를 줄이기 위해 길이를 측정할 수 있는 length라는 것이 있음.
		
	System.out.println(9/10);
	}

	
}


