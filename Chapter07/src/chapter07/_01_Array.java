package chapter07;

public class _01_Array {

	public static void main(String[] args) {
		// 일차원 배열 선언 및 접근 연습
		// int 	a		b		c		d		e; => 만약 50개를 선언해야한다면?
		// 		a[0]	a[1]	a[2]	a[3]	a[4] => 인덱스
		//
//		int[] a;		// 스택메모리에 a가 만들어짐
//		
//		a = new int[5]; // 힙메모리에 배열을 만들어 놓고 기다림
		
		int[]a = new int[5]; //이렇게 쓸 수 도 있음
		
		a[2] = 99;
		a[4] = 34;
		a[0] = a[2] + a[4];
		
	}
}