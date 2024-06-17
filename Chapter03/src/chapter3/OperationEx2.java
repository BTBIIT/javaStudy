package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		System.out.println("증감 연산자 실습");
		// 증가, 감소 연산자
		int gameScore = 150;
		int level = 10000;
		
		int lastScore = ++gameScore;
		// gameSocre = gameScore + 1;
		// lasScore = gameScore;
		
		System.out.println(lastScore);	// gameScore에 증감이 일어난 값
		System.out.println(gameScore);	// gameScore에 증감이 일어난 값 (위 주석과 중복아님)
		
		int lastlevel = level++;
		// lastlevel = level = 먼저 level 대입이 됨. 그 후 level 증감이 일어남.
		// level = level + 1 // 10001
		System.out.println(lastlevel);	// level의 값이 출력
		System.out.println(level);		// level에 + 1이 증가가 된 값이 출력
///////////////////////////////////////////////////////////////////////////////////////
		
		// 관계 연산자(비교연산자 실습)
		System.out.println("관계 연산자(비교연산자 실습)");
		int fatherAge = 45;
		int motherAge = 47;
		boolean value;		// boolean type은 true, false 두가지 타입만 가지고 있음
		
		value = fatherAge == motherAge; // value에 motherAge와 fatherAge 가 같은 값인지 물어봄
										// 두 값은 같지 않기 때문에 value는 false가 됨.
				
		//System.out.println(fatherAge < motherAge); // true / false 로 값이 출력됨.
		
		System.out.println(value); // value는 false가 출력됨
//////////////////////////////////////////////////////////////////////////////////////
		
		// 논리 연산자 실습
		System.out.println("논리 연산자 실습");
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0); // num1이 0보다 '크고' num2가 0보다 크면 true
		System.out.println(flag); //flag 출력 true 출력
		
		flag = (num1 < 0) && (num2 > 0); // num1이 0보다 '작고' num2가 0보다 클 경우 true 
		System.out.println(flag);		 // 즉 flase출력
		
		flag = (num1 < 0) || (num2 > 0); // num1이 0보다 '작거나', num2가 0보다 클 경우 true
		System.out.println(flag);		 // 즉 true 출력
		
		flag = !(num1 >0);				// num1이 0보다 크지 '않을' 경우 -> 같거나 작을 경우 true
		System.out.println(flag);		// flase 출력
/////////////////////////////////////////////////////////////////////////////////////////
	}

}
