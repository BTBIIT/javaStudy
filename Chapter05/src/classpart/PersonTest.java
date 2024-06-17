package classpart;


public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();	// a = new A();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numOfchildren =3;
		
		System.out.println("이 사람의 나이 : " + person.age);
		System.out.println("이 사람의 이름 : " + person.name);
		System.out.println("이 사람의 결혼 여부 : " + person.isMarried);
		System.out.println("이 사람의 자녀 수 : " + person.numOfchildren);
		System.out.println(1); 		//메서드 오버로딩
	}
}

