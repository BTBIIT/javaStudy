package q5;

public class Genesis extends Car {
	
	@Override
	public void turnOn() {
		System.out.println("Genesis의 시동을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis의 시동을 끕니다.");
	}
	
	
	@Override
	public void drive() {
		System.out.println("Genesis가 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Genesis가 멈춥니다.");
	}

}
