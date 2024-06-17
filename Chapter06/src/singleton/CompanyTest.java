package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		//Company myCompany1 = new Company(); //막기
		Company myCompany1 = Company.getInstance(); // 이렇게 사용해야함.
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
		// 인스턴스는 하나만 만들어지기 때문에 위 코드 실행 시 같다고 나올 수 밖에없음
		// true일경우 1개의 인스턴스만 만들어진다 라는 뜻
	
	}

}
