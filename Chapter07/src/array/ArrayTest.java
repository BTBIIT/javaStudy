package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 초기화 하고 출력하기
		//int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] num = new int[10] ; // 0 으로 초기화가 됨
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]); // num[0] num[1] ... num[9]
		}

	}

}
