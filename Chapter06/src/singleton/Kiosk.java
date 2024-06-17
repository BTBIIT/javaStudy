package singleton;

public class Kiosk {
	private static Kiosk instance = new Kiosk();
	private Kiosk() {}

	public static Kiosk getInstance() {
		if (instance == null) {
			instance = new Kiosk();
		}
		return instance;
	}
	
	public Order createOrder() {
		Order order = new Order();
		return order;
	}
	




}
