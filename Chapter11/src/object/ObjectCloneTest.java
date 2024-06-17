package object;

class Point{
	int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
				
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " 
				+y;
				
	}
	


}
// Cloneable 객체를 복제해도 된다는 의미로 이 인터페이스를 함께 선언

class Circle implements Cloneable{
	Point point;
	int radius;
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x,y);
	}
	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다." ;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}


public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Object clone() 메서드 연습
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
