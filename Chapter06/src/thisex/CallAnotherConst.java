package thisex;

class Person{
	String name;
	int age;
	
	Person(){
		//System.out.println("생성자 형성");
		this("이름 없음", 1); // 밑에 생성된 함수를 의미  2.this 다른 생성자 호출 가능 // 무조건 첫 라인에 있어야 함
	}

	

	Person(String name, int age){
		// 1. this : 자신의 메모리 주소를 참조			// 일반적으로 가장 많이 사용 // 매개변수 이름이 동일할 때 
		this.name = name;	// 매개변수 name을 의미
		this.age = age;		// 매개변수 int를 의미
	}

	Person returnItSelf() {
		// 3. this : 자신의 주소를 반환하는 this	// 자신의 레퍼런스를 반환할 때
		return this;		//2b193f2d
	}




}

public class CallAnotherConst {

	
	public static void main(String[] args) {
		// this로 다른 생성자 호출하기
		Person noName;
		noName = new Person();  // == Persnon noname = new Person();
		System.out.println(noName.name);	// 기본 생성자 이름 없음
		System.out.println(noName.age);		// 기본 생성자 나이
		
		Person person = noName.returnItSelf();		// 위 noName을 반환
		System.out.println(person.age);		//	noName의 나이
		System.out.println(person.name);	//	noName의 이름
		
		System.out.println(noName);
		System.out.println(person);
		
		
		
		
	}

}
