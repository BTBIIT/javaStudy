package staticex;

public class Student1 {
	// static 변수는 Student class에 있지만, 
	// 인스턴스 생성과 상관 없이 먼저 생성됨.
	public static int serialNum = 1000;	// 클래스 변수
	
	
	// 멤버변수 = 인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		// 학생이 생성될 때마다 일련번호 증가
		serialNum = serialNum + 1; //
		studentID = serialNum; // 증가된 값을 학번 인스턴스에 대입
	}
	
	// 메서드
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
