package whileex;

public class _02_break {

	public static void main(String[] args) {
		int i =1;
		while(true) {
			System.out.print(i + " ");
			i++;
			if(i > 100) {
				break;
			}
			if(i > 50) {
				continue;
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");			
			
		}
		
	}

}
