package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		// 정수 배열에서 스트림 활용하기			// 
		int[] arr = {1,2,3,4,5};				// 배열 스트림 생성 원본을 훼손하지 않음
		int sumVal = Arrays.stream(arr).sum();	// 별도의 메모리 공간
		int count = (int)Arrays.stream(arr).count(); // 한번 사용한 스트림은 재사용 할 수 없음
		
		System.out.println(sumVal);
		System.out.println(count);
		// 재사용하면 이와 같이 오류남
//		IntStream obj = Arrays.stream(arr); 
//		int sumVal2 = obj.sum();
//		int count2 = (int)obj.count();
//		System.out.println(sumVal2);
//		System.out.println(count2);
//		
		
	}

}
