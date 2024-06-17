package alone;

class Sum{
	int a,b;
	static int sSum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sSum(n-1);
	}

	int add() {
		return a + b;
	}
	static int add2(int a, int b) {
		return a + b;
	}

}

public class Math {

	public static void main(String[] args) {
		System.out.println(Sum.sSum(10));
	}

}