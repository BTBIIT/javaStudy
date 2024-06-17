package array;

public class CharArray {

	public static void main(String[] args) {
		// 알파벳 문자와 아스키코드 값 출력하기
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i =0; i<alphabets.length; i++,ch++) //ch에는 A가 65로 저장되어있기 때문에 ++이 먹힘  
		{
		alphabets[i] = ch; //i++에 있는 ch++을 여기다가 적어도 됨 alphabets[i] = ch++ 이렇게
		//	for(int i =0; i<alphabets.length; i++){
		// 	alphabets[i] = ch;
		//	ch++;
		//	}
		}
		
		
		for(int i =0; i<alphabets.length; i++) 
		{
		System.out.println(alphabets[i] + "," + (int)alphabets[i]);	
		}
		
		
		
		
	}

}
