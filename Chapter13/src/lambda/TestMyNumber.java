package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		// 람다식 구현과 호출
		MyNumber max = (num1, num2) -> (num1 >= num2) ? num1 : num2;		//이는 아래 주석의 식과 같음
		
		
		// 위 식을 풀은 식
		MyNumber max1 = new MyNumber(){
			@Override
		 	public int getMax(int num1, int num2){
		 		return (num1 >= num2) ? num1 : num2;
		 	}
		};
			
		System.out.println(max1.getMax(10, 20));
		System.out.println(max.getMax(10, 20));
		
		
		// 람다식 응용
		MyNumber add = (num1, num2) -> (num1 + num2);
		System.out.println(add.getMax(10, 20));		// 30
	}

}
