package staticex;

public class Student2 {
	// static 변수는 Student class에 있지만, 
	// 인스턴스 생성과 상관 없이 먼저 생성됨.
	// 클래스 메서드 인스턴스 생성과 상관없이 먼저 생성됨
	public static int serialNum = 1000;	// 클래스 변수
	
	
	// 멤버변수 = 인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
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

	// Static 메서드 = 클래스 메서드 // 로드 되는 시점에 로드됨.
	public static int getSerialNum() {
		int i = 10;
		// studentName = "이순신"; // 오류발생 클래스메서드임으로 인스턴스변수 사용불가
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
}
