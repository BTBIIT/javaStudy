package finalex;

// 열거형 데이터 타입 : 범주에 해당하는 것을 사용할 수 있음.
enum DayType{
	SUN, MON, TUE, WED, THU, FRI, SAT
}

public class UsingDefine {
	private DayType datatype;
	
	public UsingDefine(DayType dType) {
		this.datatype = dType;
	}
	
	public static void main(String[] args) {
		// 상수 클래스 사용하기
		System.out.println(Define.GOOD_MORNING);	// ** Static이 붙은 변수는 클래스 변수로 참조변수 없이 사용가능!
		System.out.println("최솟값 : " + Define.MIN);
		System.out.println("최댓값 : " + Define.MAX);
		System.out.println("수학 과목 코드는 " + Define.MATH);
		System.out.println("영어 과목 코드는 " + Define.ENG);
		
		
		System.out.println(DayType.THU);
		
		UsingDefine ud = new UsingDefine(DayType.THU); // 열거형 데이터 타입은 정해진 데이터 타입의 값만 불러올 수 있음. // 자주는 사용 안함
	
	
	}

}
