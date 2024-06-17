package corporation;

public class Subway {
	// 멤버변수
	String lineNumber;	// 지하철 노선
	int passengerCount;	// 승객 수
	int money;				// 지하철 수입
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	// 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + 
							"명 이고," + "수입은 " + money + "원 입니다.");
	}

}
