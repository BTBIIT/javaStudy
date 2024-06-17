package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		// 정적(Static) 변수 연습
		
		// 호출하는 시점에 serialNum이 증가 후 학번이 대입 
		Student1 studentLee = new Student1(); 
		
		// 따라서 이순신의 학번은 1001
		studentLee.setStudentName("이순신");
		System.out.println(studentLee.studentName + " 학번 " +
							+ studentLee.studentID); 
		
		// 호출하는 시점에 serialNum이 증가
		Student1 studentHong = new Student1();
		// 따라서 홍길동의 학번은 1002
		studentHong.setStudentName("홍길동");	// 
		System.out.println(studentHong.studentName + " 학번 " +
				+ studentHong.studentID); 
	}

}
