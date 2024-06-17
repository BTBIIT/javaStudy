package chapter06;
// 중요한 내용
public class Circle {
	//멤버 변수, 필드, 속성
	int radius;
	String name;
	
	public Circle() {}
	
	
//	public Circle(int r) {
//		radius = r;
//	}
	
	public Circle(int radius) {
		this.radius = radius;		//this : 객체 자신에 대한 레퍼런스를 가지고 있다.
	}

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle ob1 = new Circle(1);	//ob1 : 0x0050	radius : 1
		Circle ob2 = new Circle(2); //ob2 : 0x0088	radius : 2
		Circle s = ob2;				//ob2 : 0x0077
					// [매우중요] 참조 변수 값을 다른 참조변수의 값이 대입되면,
							// 객체가 대입되는 것이 아니라 주소값이 대입
		s =	ob2;					// s : 0x0077
		System.out.println(s.radius);
		
		ob1 = ob2;					//	ob1이 갖고 있는 인스턴스 가비지 가 됨
									//	ob1 : 0x0077
		System.out.println(ob1.radius);		// 2
		System.out.println(ob1);		
		System.out.println(ob2.radius);		// 2
		System.out.println(ob2);		
	}
	
	}
	

