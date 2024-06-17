package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// try-catch문 사용하기
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			if(fis != null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();						// trace를 해서 보여줌 -> 로그파일이 많이 쌓이기 때문에 안좋아함 // 개봘과정에서만 이 것을 사용
			System.out.println(e.getMessage());
		}
		
		System.out.println("여기까지도 수행됩니다. ");
		
	}

}
