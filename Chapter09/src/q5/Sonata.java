package q5;

public class Sonata extends Car {
	
	@Override
	public void turnOn() {
		System.out.println("Sonata의 시동을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata의 시동을 끕니다.");
	}
	
	
	@Override
	public void drive() {
		System.out.println("Sonata가 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Sonata가 멈춥니다.");
	}

}
