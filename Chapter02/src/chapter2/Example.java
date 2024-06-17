package chapter2;

public class Example {
// Example 1 실급여 계산 테스트
	public static void main(String[] args) {
		int hong = (int) ((1500000 * 0.9) + 700000);
		//System.out.println(hong);
		System.out.printf("홍길동 군의 실급여액은 %.0f원 입니다", (float)hong);

	}
}
