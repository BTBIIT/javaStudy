package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// ArrayList 에서 스트림 활용하기
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream(); // 스트림 생성	// 위처럼 생성 후 아래 처럼 사용하면 이후 사용 불가
		stream.forEach(str -> System.out.print(str + "\t"));	// 하나씩 하나씩 향상된 for문 처럼 사용
		System.out.println();
		
		// 스트림 중간연산과 최정연산을 같이 도트연산자 사용 : 체이닝 기법
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));	// sorted = 알파벳 정렬
		
	}

}
