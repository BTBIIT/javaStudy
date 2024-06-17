package array;

import java.util.ArrayList;  //ArrayList 클래스 import

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 클래스 사용하기
		ArrayList<Book> library = new ArrayList<Book>();

		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐베리"));
		
		for(Book book : library) {   // 향상된 for문
			book.showBookInfo();
		}
		System.out.println();
		
		for(int i=0; i<library.size(); i++) { //ArrayList size()
			Book book = library.get(i);		//Book book = new Book("태백산맥", "조정래");
			book.showBookInfo();
		}
	}

}
