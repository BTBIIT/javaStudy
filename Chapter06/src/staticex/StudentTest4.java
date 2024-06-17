package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		// 클래스 이름으로 static 변수 참조하기
		// static 변수는 클래스 이름으로 직접 참조합니다.
		Student2 studentLee = new Student2(); 
		studentLee.setStudentName("이순신");
		// 참조 변수 없이 직접 가져옴
		System.out.println(Student2.getSerialNum()); // 참조변수 없이 메서드 불러오기 
		System.out.println(studentLee.studentName + " 학번 " +
							+ studentLee.studentID); 
		
		Student2 studentHong = new Student2();
		studentHong.setStudentName("홍길동");
		System.out.println(Student2.getSerialNum()); // 참조변수 없이 메서드 불러오기 
		System.out.println(studentHong.studentName + " 학번 " +
				+ studentHong.studentID); 
	}

}
