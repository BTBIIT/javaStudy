package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ArrayExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException {
		int [] arr = new int [5];
		
		try {
		for (int i = 0; i <= 5 ; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("#########################################예외 처리 발생#########################################");
		}
		System.out.println("계속되는 작업");
		System.out.println("프로그램 종료");
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
