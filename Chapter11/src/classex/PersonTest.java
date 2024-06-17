package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) {
	Class personClass = Person.class;
		
		// 생성자 가져오기
		Constructor[] cons = personClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("=== 멤버변수 ===");
		Field[] fields = personClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("=== 메서드 ===");
		Method[] methods = personClass.getMethods();
		for(Method f : methods) {
			System.out.println(f);
		}


	}

}
