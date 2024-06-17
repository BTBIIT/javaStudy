package constructor;

public class Person {
	//멤버 변수
	String name;
	float height;
	float weight;
	
	// 기본생성자			//아무것도 없거나, 따로 만들어주거나 해야 함.
	public Person() {}
	
	// 생성자 예시
	public Person(String pname) {
		name = pname; // 초기화
	}
	// 이건 안됨
//	public Person(String n) {
//		name = n; // 초기화
//	}
	
	
	
	// 생성자 오버로딩
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
