package singleton;

public class KioskTest {

	public static void main(String[] args) {
		Kiosk kiosk = Kiosk.getInstance();	//kiosk변수로 Kiosk의 instance에 접근
		
		// createOrder로 인스턴스에 접근 후 내부의 getOrderNumber를 사용
		Order order = kiosk.createOrder();
				
		System.out.println(order.getOrderNumber());		
	}

}
