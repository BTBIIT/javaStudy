package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
// 이름있는 클래스 
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String str1, String str2) {
		if(str1.getBytes().length >= str2.getBytes().length) {
			return str1;
		} else {
			return str2;
		}
	}
	
	/*

	 	 BinaryOperator<String> accumulator = (str1, str2) ->{
	 												if(str1.getBytes().length >= str2.getBytes().length){
	 													return str1;
	 												} else {
	 													return str2;
	 												}
	 											};
	 
	 
	 
	 
	 (str1, str2) -> (str1.getBytes().length >= str2.getBytes().length) ?  str1   :   str2;
	 */
	
	
	
	
}


public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~~~", "hello", "Good morning", "반갑습니다^^"};
		
		String str = Arrays.stream(greetings).reduce("", new CompareString());		// "" accmulator
		System.out.println(str);
		
		String str2 = Arrays.stream(greetings).reduce("", (st1, st2) ->{
				if(st1.getBytes().length >= st2.getBytes().length){
						return st1;
					} else {
						return st2;
					}
				});
		System.out.println(str2);
		
		
		
		
		
		// BinaryOperator<String> accmulator = new CompareString();
	}

}
