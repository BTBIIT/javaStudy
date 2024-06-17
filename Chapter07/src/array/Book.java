package array;

public class Book {								// 클래스
	// 멤버 변수	=	필드	= 인스턴스변수
	private String bookName;
	private String author;
	
	//생성자
	public Book() {}	// 기본 생성자
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	
	//매서드
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
		
	

}
