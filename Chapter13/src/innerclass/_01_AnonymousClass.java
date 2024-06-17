package innerclass;

//class Person{
//	public void introduce() {
//		System.out.println("사람입니다.");
//	}
//}

interface Personable{
	void introduce();
}




public class _01_AnonymousClass {

	public static void main(String[] args) {
		
//		Person person = new Person();
		Personable person = new Personable() {
			
			@Override
			public void introduce() {
				System.out.println("사람입니다.");
			}
		};
		
		person.introduce();
		
	}
/**********************************
 	람다식
 	public int add(int x, int y){
 		return x + y;
 	}
 	
 	// 간소화 처리 : 람다식
 	(x, y) -> x + y;
 
 **********************************/
}
