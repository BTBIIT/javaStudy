package singleton;

public class Order {
	private int orderNumber;
	private static int serialNum = 100;

	Order(){
		serialNum++;
		orderNumber = serialNum;
	}

	public int getOrderNumber() {
		return orderNumber;
	}


}
