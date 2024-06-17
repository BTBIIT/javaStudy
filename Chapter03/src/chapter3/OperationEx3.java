package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		// 논리 연산자 : 단락 회로 평가 실습하기
		System.out.println("논리 연산자 : 단락 회로 평가 실습하기");
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10 && (i = i+2) < 10 );	
		// 위 줄 해석 = num1+10 값을 num1에 대입한 값이 10보다 작고, i+2 값을 i에 대입한 값이 10보다 작으면 true
		
		System.out.println(value);
		// num1 값은 20, i 값은 2로 i는 만족하지만 num1이 만족하지 않아 false		
		
		System.out.println(num1);	// 20
		System.out.println(i);		// 2
		// i가 2인 이유 : num1에 10을 더한 값이 10보다 크므로 뒤에 항이 실행되지 않았음.
		// num1에는 num1 + 10이 이미 더해진 상태이므로 20

		// 논리합 연산에서 앞의 항이 true 결과가 참이므로 뒤에 항은 실행하지 않음.
		value = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);
		// 위 줄 해석 = num1+10 값을 num1의 값에 대입한 값이 10보다 크거나 i+2값을 i에 대입한 값이 10보다 작으면 true
	
		System.out.println(value); // true
		System.out.println(num1);  // 30
		System.out.println(i);	// 2
		
		
		int num = 5;
		int j = 10;
		
		boolean val = ((num = num * 10) > 45) || ((j=j-5) < 10);
		// 위 줄 코드 해석 = num = num*10 값을 대입한 값이 45보다 크거나 j = j-5값이 10보다 작으면 true		
		
		System.out.println(val); // true
		System.out.println(num); // 50
		System.out.println(j);  //	10
		// j가 10이 나온 이유 : num이 50으로 > 45를 만족하므로 뒤에 항은 일어나지 않음.
		// 반대로 num이 50보다 작을 경우 뒤에 항이 실행되므로 j 는 5가 됨
				
	}

}
