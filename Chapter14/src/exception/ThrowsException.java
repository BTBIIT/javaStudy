package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	// 메서드
	public Class loadClass(String fileName, String className) throws 
			FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	
	public static void main(String[] args) {
		// throws로 예외 미루기
		ThrowsException test = new ThrowsException();
		

			try {
				test.loadClass("a.txt", "java.lang.String");
			} catch (FileNotFoundException e) {    // 예외 각상황마다 다른방식 처리가능
				e.printStackTrace();
			} catch (ClassNotFoundException e) {    // 예외 각상황마다 다른방식 처리가능
				e.printStackTrace();
			} catch (Exception e) {					// 에러를 잡는 것 중에는 가장 상위 클래스이므로 마지막에 작성
				e.printStackTrace();				// 위 에러를 제외하고 나머지를 잡아달라
			}

	}

}
