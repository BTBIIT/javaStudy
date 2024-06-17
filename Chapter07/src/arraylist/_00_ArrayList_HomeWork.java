package arraylist;

public class _00_ArrayList_HomeWork {

	public static void main(String[] args) {
		
	/*****************************************************************
	로또 번호 출력 프로그램을 작성해보자.
	1 ~ 45 사이의 번호를 랜덤하게 6개 출력하면 된다. 단, 6개의 숫자는 중복되면 안된다.
	[출력 예]
	== 이번 주 당첨 번호 ==
	5, 41, 36, 38, 2, 7
	 *****************************************************************/
	int[] lotto = new int[6];
	System.out.println("== 이번 주 당첨 번호 ==");
	for(int i =0; i<lotto.length; i++) {
	lotto[i] = (int) ((Math.random() * 45) + 1); // (0 ~ 44) + 1 = (1 ~ 45)

	
	//여기에 중복되지 않는 수를 생성되게 작성해보세요.
		/*
		문제 해석
		한 번 돌고 나면 0번째 자리에 값이 할당 (다른 자릿수와 겹치지 않음으로)해당 값은 lotto의 다른 자릿 수 값과 겹치면안됨 <비복원 추출>
		두 번째 숫자는 첫번째 자릿수와 겹치면 안됨
		세 번째 숫자는 첫번째 자릿수와 두번째 자릿수와 겹치면 안됨
		네 번째 숫자는 첫번째...세번재와 겹치면 안됨
		...
		여섯 번째 숫자는 첫번째 ~다섯번째 숫자와 겹치면 안됨
		즉 for문을 쓰면서 값을 비교해야 함.
		*/

//		System.out.print(lotto[i]+ "\t");
//  if(i != 0) {
//  if(i == 1) {
//     if(lotto[i-1] == lotto[i]) {
//        lotto[i] = (int) ((Math.random() * 45) + 1);
//  }
//  } else if(i==2) {
//     if(lotto[i-1] == lotto[i] || lotto[i-2] == lotto[i]) {
//        lotto[i] = (int) ((Math.random() * 45) + 1);
//     }
//  } else if(i==3) {
//     if(lotto[i-1] == lotto[i] || lotto[i-2] == lotto[i] || lotto[i-3] == lotto[i]) {
//        lotto[i] = (int) ((Math.random() * 45) + 1);
//     }
//  } else if(i==4) {
//     if(lotto[i-1] == lotto[i] || lotto[i-2] == lotto[i] || lotto[i-3] == lotto[i] || lotto[i-4] == lotto[i]) {
//        lotto[i] = (int) ((Math.random() * 45) + 1);
//     }
//  } else if(i==5) {
//     if(lotto[i-1] == lotto[i] || lotto[i-2] == lotto[i] || lotto[i-3] == lotto[i] || lotto[i-4] == lotto[i] || lotto[i-5] == lotto[i]) {
//        lotto[i] = (int) ((Math.random() * 45) + 1);
//     } 
//  }             
//}
	
	
		boolean chk = true;
		for(int j = 0; j <i; j++) {
			if(lotto[i] == lotto[j]) {
				i--;
				chk = false;
			}
		}
		if (chk == true) {
			System.out.print(lotto[i] + " ");
		}
	
	
	
	
	}
	
	}
}


