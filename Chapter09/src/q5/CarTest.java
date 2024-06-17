package q5;

import java.util.ArrayList;



public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run(); //탬플릿메서드 start(); drive()l stop(); turnoff();
			System.out.println("==================================");
		
		}

	
	
	
	}

}
