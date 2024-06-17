package object;

class Student{
	int studentID;
	String studentName;
	// 참조변수 출력 시 학생의 이름과 학번이 출력되도록 여기에 코드를 작성해보시오.
	Student(int studentID, String studentName){
		this.studentName = studentName;
		this.studentID = studentID;
	}
	@Override
	public String toString() {
		return studentName + "(" + studentID + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
//			if(this.studentID == std.studentID) {
//				return true;
//			}else {
//				return false;
//			}
			return (this.studentID == std.studentID);
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
	
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
	// equals 재정의 연습 : 논리적으로 깊게 처리를 하고 싶을때 재정의
	Student lee = new Student(100, "이순신");
	Student lee2 = lee;	//주소 복사 == 얕은 복사
	Student soonsin = new Student(100, "이순신");
	
	System.out.println("lee의 hashCode : " + lee.hashCode());
	System.out.println("soonsin의 hashCode : " + soonsin.hashCode());
	
	System.out.println("lee의 실제 주소 값 : " + System.identityHashCode(lee));
	System.out.println("soonsin의 실제 주소 값 : " + System.identityHashCode(soonsin));
	
//	if (lee == lee2) {
//		System.out.println("lee와 lee2의 주소는 같습니다.");
//	} else {
//		System.out.println("lee와 lee2의 주소는 다릅니다.");
//	}
//	
//	if(lee.equals(lee2)){
//		System.out.println("lee와 lee2의 주소는 같습니다.");
//	} else {
//		System.out.println("lee와 lee2의 주소는 다릅니다.");
//	}
//	
//	// 동일인이지만 인스턴스가 주소가 다른 경우
//	if(lee == soonsin) {
//		System.out.println("lee와 soonsin의 주소는 같습니다.");
//	} else {
//		System.out.println("lee와 soonsin의 주소는 다릅니다.");
//	}
//	
//	if(lee.equals(soonsin)){
//		System.out.println("lee와 soonsin의 주소는 동일합니다.");			// 재정의
//	} else {
//		System.out.println("lee와 soonsin의 주소는 동일하지 않습니다.");
//	}
	

	
	
	
	}
}
