package forexample;

public class DoublyFor2 {
	// 전자시계
	public static void main(String[] args) {
		
		for(int i=14; i<=23; i++) {		//시간		00 ~ 23
			
			for(int j =0; j<=59; j++) {	//분			00 ~ 59
				System.out.printf("%2d시 %2d분\n",i,j);
			}
			System.out.println();
		}

	}
}