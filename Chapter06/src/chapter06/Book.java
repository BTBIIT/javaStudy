package chapter06;

public class Book {								// 클래스
	// 멤버 변수
	String title;
	String author;
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	
	// 생성자
	public Book(String title) {
		this(title, "작자미상");
		
//		this.title = title;
//		this.author = "작자미상";
		
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}	

	
	public static void main(String[] args) {	// 매서드
		// 생성자 선언 및 활용 연습
		Book litterPrince = new Book("어린왕자", "생택쥐베리");
		Book loveStory = new Book("춘향전");
//		System.out.println(litterPrince.title + "의 작가는 " + litterPrince.author + "입니다." );
//		System.out.println(loveStory.title + "의 작가는 " + loveStory.author + "입니다." );
		Book emptyBook = new Book(); // 생성자 호출됨
		loveStory.show();		// 춘향전 작자 미상
		litterPrince.show();	// 어린왕자 생택쥐페리
		
		
	}

}
