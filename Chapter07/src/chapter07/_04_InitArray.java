package chapter07;

public class _04_InitArray {
	// 초기화 및 초기 값 입력
	public static void main(String[] args) {
		
		
		// int[] arr = new int[5] 0이 들어가 있음
		// int[] arr = new int[5] {1,2,3,4,5};	이러면 오류1
		int[] arr;
		arr = new int[] {1,2,3,4,5};	// 초기 값이 1,2,3,4,5가 들어감
		
		
		int[] arr1 = {10, 20, 30, 40, 50}; // 초기화 시켜주는 2
		
		//int[] arr2;						// 이렇게 하면 오류남2
		//arr2 = {10, 20, 30, 40, 50};		// 이렇게 하면 오류남2
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		////////////////////////////////////////////////
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

	
}
