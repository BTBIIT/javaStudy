package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// 싱글톤 패턴으로 클래스 구현 연습
		// 이 공장 클래스에서 자동차가 생성될 때 마다 10001 에서 증가
		
		// 10002, 10003 자동차번호가 붙도록 자동차클래스를 생성해보세요.
		
		CarFactory factory = CarFactory.getInstance(); // 싱글톤 메서드
		// factory를 참조변수로 CarFactory의 instance 생성
		

		// 싱클톤 메서드에서 Car 생성
		Car mySonata = factory.createCar(); // mySonata로 factory에서 new Car를 리턴받음
		// Car가 생성됨에 따라 serialNum가 1 증가함
		Car yourSonata = factory.createCar(); // yourSonata로 factory에서 new Car를 받음
		// Car가 생성됨에 따라 serialNum이 또 1 증가함
		
		//최초의 SerialNum은 10000이나 serialNum이 증가하는 것이 먼저이므로 <Car 10 line>
		System.out.println(mySonata.getCarNum()); //10001 출력
		System.out.println(yourSonata.getCarNum()); //10002 출력
		
	}

}
