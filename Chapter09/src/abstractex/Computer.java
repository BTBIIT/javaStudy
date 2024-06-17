package abstractex;

public abstract class Computer {
	// 추상메서드가 한개라도 존재하면 추상클래스 의미로 abstract를 적어줘야함
	// 상속을 위한 클래스
	public abstract void display(); // {} 없는 메서드 : 추상메서드
	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
