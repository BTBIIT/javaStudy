package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		// try-catch문 사용하기
		try {
			fis = new FileInputStream("a.txt");
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		}	finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally가 항상 수행 됩니다.");
		}
		
		
		System.out.println("여기까지도 수행됩니다.");

	}

}
