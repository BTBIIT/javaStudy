package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		// 조건 연산자 실습
		int motherAge = 47;	// 정수 47
		int fatherAge = 45; // 정수 45
		
		char ch; // 빈 character 변수 ch 생성
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		// fatherAge가 motherAge보다 크면 T가 아니면 F가 ch에 대입이 됨.
		System.out.println(ch);
		
		int diff ; // 빈 integer 변수 diff 생성
		diff = (fatherAge > motherAge) ? (fatherAge - motherAge) : (motherAge - fatherAge);
		// fatherAge가 motherAge보다 크면 fatherAge - motherAge를 아니라면 motherAge - fatherAge를 대입.
		System.out.println(diff);
		
		int num = 10;
		boolean isEven ;
		isEven = (num % 2) == 0 ? true : false ;
		// num을 2로 나누었을 때 나머지가 0이면 true, 아니면 false를 isEven에 대입		
		System.out.println(isEven);
		
	}

}
