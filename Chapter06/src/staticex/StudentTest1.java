package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		// 정적(Static) 변수 연습
		Student studentLee = new Student();	// Student Class에 기본생성자가 없지만
											// 컴파일러가 자동으로 생성함
		
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.serialNum); // 노란줄이 뜨는 이유 : 참조변수가 필요하지 않기 때문
		studentLee.serialNum++;
		
		Student studentHong = new Student();
		studentHong.setStudentName("홍길동");
		
		System.out.println(studentLee.serialNum);	// 1001
		System.out.println(studentHong.serialNum);	// 1001
	}
}