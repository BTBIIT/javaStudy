package homework;

public class StrarTest {

	public static void main(String[] args) {
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		
	
		for(Unit unit : group) {
			unit.move(100, 200);
		}
	
	}
	
}
