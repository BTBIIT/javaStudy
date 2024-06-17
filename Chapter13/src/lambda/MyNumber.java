package lambda;


@FunctionalInterface		// 하나만 쓸 수 있지 다른 하나는 쓸수 없다는 뜻
public interface MyNumber {
	int getMax(int num1, int num2);
	// int add(int num1, int num2);
}

