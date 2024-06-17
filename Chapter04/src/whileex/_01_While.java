package whileex;

public class _01_While {

	public static void main(String[] args) {
		// while문과 do~while문
		int i=1;	//초기식
		
//		while(조건) {
//			실행 명령문;
//		}
		while(i <= 990) {	//조건식이 맞는 동안에는 계속 반복하라
			System.out.print(i + " ");
			i++; // i = i + 1 == i+=1 증감식
		}
	System.out.println();
	System.out.println(i);
	i = 1;	
	do {	//일단 해라
		System.out.print(i + " "); // 실행 명령문
		i +=1;
	}while(i <= 990);
	System.out.println();
	System.out.println(i);

	}
}
