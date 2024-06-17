package tostring;

class Student{
	int studentID;
	String studentName;
	
	Student(String studentName, int studentID){
		this.studentName = studentName;
		this.studentID = studentID;
	}
	// 참조변수 출력 시 학생의 이름과 학번이 출력되도록 여기에 코드를 작성해보시오.
	@Override
	public String toString() {
		return studentName + "(" + studentID + ")";
	}


}


public class _01_ToStringEx {

	public static void main(String[] args) {
		// Object 클래스의 toString() 메서드 사용하기
		Student student = new Student("홍길동", 1111);
		// toString() : 객체를 문자열로 표현하여 반환
		// 				재정의 하여 객체에 대한 설명이나 특정 멤버 변수값을 반환하는 용도로 사용
		System.out.println(student.toString());
		System.out.println(student);
	}

}
