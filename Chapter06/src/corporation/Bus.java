package corporation;

public class Bus {
	public int busNumber;			// 버스번호
	public int passengerCount;		// 승객 수
	public int money;				// 버스 수입
	
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//메서드	
	public void take(int money) {
		//	승객이 버스에 탄 경우
		this.money += money;	// 버스 수입 증가
		passengerCount++;		// 승객 수 증가
		
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount +
							"명 이고, 수입은 " + money + "원 입니다.");
	}
	
}
