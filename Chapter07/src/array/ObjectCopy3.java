package array;

public class ObjectCopy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백", "조정래");
		bookArray1[1] = new Book("데미안", "헤세");
		bookArray1[2] = new Book("어떻게","유시민");
		
		//추가
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		//깊은복사
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		} // 주소값 복사가 아닌 데이터 자체를 복사
		
		//원본배열 값 수정
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		System.out.println("========== bookArray1 ==========");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		
		
		//복사 배열값 출력
		System.out.println("========== bookArray2 ==========");
		for(int i=0; i<bookArray1.length; i++) { //내용을 카피하는 것이 아니라 주소값
			bookArray2[i].showBookInfo();		// 따라서 나목 박완서를 카피하지 않았지만
		}										// 출력은 나목 박완서가 나옴
		
	}

}
