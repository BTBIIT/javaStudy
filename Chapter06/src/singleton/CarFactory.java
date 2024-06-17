package singleton;

public class CarFactory {
	private static CarFactory instance = new CarFactory() ;
	
	//생성자
	private CarFactory() {} //외부에서 new로 사용 불가
	
	public static CarFactory getInstance() {
		if(instance == null) {			 // 혹시라도 인스턴스가 만들어지지 않았을 경우
			instance = new CarFactory(); // 인스턴스로 생성
		}
		return instance;
	}
	
	
	public Car createCar() {
		return new Car();
//		Car car = new Car();
//		return car;			
	}
	
	
}
