package classpart;

public class Student {
	//멤버변수
	private int studentID;				//학번
	private String studentName;			//학생이름
	private int grade;					//학년
	private String address;				//주소
	
//	Student()() // 기본 생성자
	
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {	// 매개변수 갈색, 멤버 변수 파란색
		studentName = name;
	}

}
