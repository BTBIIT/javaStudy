package chapter2;

public class Exampletwo {
// 홍길동 군 기말고사 시험 점수 테스트
	public static void main(String[] args) {
	int testLanguage = 97;
	int testEnglish = 79;
	int testMath = 65;
	System.out.printf("국어 : %d점\n",testLanguage);
	System.out.printf("영어 : %d점\n",testEnglish);
	System.out.printf("수학 : %d점\n",testMath);
	System.out.printf("총점 : %d점\n",(testLanguage+testMath+testEnglish));
	System.out.printf("평균 : %.2f\n",(testLanguage+testMath+testEnglish)/3.0);
	System.out.println("등급 : B");
	}

}
