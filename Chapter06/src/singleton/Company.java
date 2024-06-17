package singleton;

public class Company {
	// 인스턴스 1개만 생성해서 사용 따라서 외부접근을 막고자 private를 사용
	private static Company instance = new Company();
	// private는 같은 Class내에서는 접근이 가능
	
	//생성자
	private Company() {} // 외부에서 new 로 사용 불가능
	
	
	// 메서드
	public static Company getInstance() {
		if(instance == null) {			// 혹시라도 인스턴스가 안 만들어졌을 경우
			instance = new Company();	// null<비어있으면> 생성자로 만듬
		}
		return instance;
	}
	

	
	
}
