package chapter06;

public class CircleTest {

	public static void main(String[] args) {
		// 클래스의 객체 생성 및 활용
		Circle pizza;	//??
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
	
	
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
		
		
	}

}
