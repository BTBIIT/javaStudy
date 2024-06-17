package staticex;

public class Scope {
	/* 변수 유효 범위
------------------------------------------------------------------------------------------------------------------------------ 
	- 지역변수<로컬 변수>
		함수 내부 에서만 사용		스택메모리에서 생성		함수호출시생성, 함수가 끝나면 소멸
		
		<예시 코드>
		public void setStudentName(String studentName) { 에서
					studentName 변수 지역변수임
		}
------------------------------------------------------------------------------------------------------------------------------
	-멤버변수<인스턴스 변수>
		클래스 멤버변수 선언부		힙메모리에서 생성			인스턴스가 생성될 때 만들어짐
												해당 인스턴스 참조가 없으면 Garbage Collector(GC)가 수집해줌 / C, C++은 직접 청소해줘야함
												private이 아니면 다른 클래스에서 사용가능
		<예시 코드>
		public int studentID;
		public String studentName; 등
------------------------------------------------------------------------------------------------------------------------------ 	
	-static변수<클래스 변수>
		static 예약어를 사용	데이터영역에서 생성		프로그램이 처음 시작될 때 데이터 영역에 만들어지고, 프로그램이 끝날때 없어짐
												
		클래스 내부에 선언							private이 아니면 해당 클래스 이름으로 다른 클래스에서 사용가능.
------------------------------------------------------------------------------------------------------------------------------ 	
	
	
	
	
	*/
	// static 변수는 Student class에 있지만, 
	// 인스턴스 생성과 상관 없이 먼저 생성됨.
	// 클래스 메서드 인스턴스 생성과 상관없이 먼저 생성됨
	public static int serialNum = 1000;	// 클래스 변수
	
	
	// 멤버변수 = 인스턴스 변수
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Scope() {
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
		Scope.serialNum = serialNum;
	}
	
}
