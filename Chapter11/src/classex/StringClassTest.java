package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// String 클래스 정보 가져오기
		Class strClass = Class.forName("java.lang.String");
		
		// 생성자 가져오기
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("=== 멤버변수 ===");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("=== 메서드 ===");
		Method[] methods = strClass.getMethods();
		for(Method f : methods) {
			System.out.println(f);
		}
	
	
	
	
	}

}
