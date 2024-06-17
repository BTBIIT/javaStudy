package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		// PerSon 클래스의 인스턴스 생성하기
		Person person1  = new Person();		// 생성자로 생성
		System.out.println(person1);
		
		
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
		
		
		
		
		
	}

}
