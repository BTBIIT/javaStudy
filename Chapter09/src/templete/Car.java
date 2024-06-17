package templete;

public abstract class Car {
	// 구현부{}가 없는 추상메서드
	public abstract void drive(); 	// 추상메서드
	public abstract void stop();	// 추상메서드2
	public abstract void wiper();
	
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	// 템플릿 메서드 // 바꿀 수 없음 // 자식클래스에서 수정이 불가
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	

	
	
	
}
