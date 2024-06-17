package stream;

public class TravelCustomer {
	// 멤버변수
	private String name;
	private int age;
	private int price;
	
	// 생성자 초기화
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	
	
	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "name : " + name + " age : " + age + " pirce : " + price;
	}
	
	
}
