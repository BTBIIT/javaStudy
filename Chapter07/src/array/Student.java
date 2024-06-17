package array;

public class Student {
	private int StudentNum;
	private String StudentName;
	private int grade;
	
	public Student() {}
	
	public Student(int StudentNum, String StudentName) {
		this.StudentNum = StudentNum;
		this.StudentName = StudentName;
	}
	
	public void showStudentInfo() {
		System.out.println(StudentNum + "," + StudentName);
	}

	
	
	//get set Array
	public int getStudentNum() {
		return StudentNum;
	}

	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
