package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	// 재정의 하여 객체에 대한 설명이나 특정 멤버 변수값을 반환하는 용도로 사용
	@Override
	public String toString(){
		return bookTitle + "," + bookNumber;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		// toString 재정의 실습
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
