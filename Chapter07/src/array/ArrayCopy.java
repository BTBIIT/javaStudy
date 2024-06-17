package array;

public class ArrayCopy {

	public static void main(String[] args) {
		//System.arraycopy() 로 배열 복사하기
		int [] array1 = {10,20,30,40,50};
		int [] array2 = {1,2,3,4,5};
		
		//array1(원본) -> array2(대상)
		
		System.arraycopy(array1, 0, array2, 1, 4); //복사할 대상	복사시작위치	넣을대상	시작위치	복사할갯수
		for(int i =0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
	}

}
