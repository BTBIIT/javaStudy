package singleton;

public class Car {
	private static int serialNum = 10000;
	// 멤버변수 = 인스턴스 변수
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum(){
		return carNum;
	
	}
	
	
	
}
