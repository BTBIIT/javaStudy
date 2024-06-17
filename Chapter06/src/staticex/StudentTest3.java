package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		// 클래스 이름으로 static 변수 참조하기
		// static 변수는 클래스 이름으로 직접 참조합니다.
		Student1 studentLee = new Student1(); 
		studentLee.setStudentName("이순신");
		// 참조 변수 없이 직접 가져옴
		System.out.println(Student1.serialNum); //1001 
		System.out.println(studentLee.studentName + " 학번 " +
							+ studentLee.studentID); 
		
		Student1 studentHong = new Student1();
		studentHong.setStudentName("홍길동");	// 1002
		System.out.println(studentHong.studentName + " 학번 " +
				+ studentHong.studentID); 
	}

}
