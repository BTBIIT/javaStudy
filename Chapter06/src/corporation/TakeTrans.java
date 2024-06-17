package corporation;

public class TakeTrans {

	public static void main(String[] args) {
		// 버스와 지하철 타기
		Student james = new Student("James", 5000);
		Student tomas = new Student("tomas", 10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway purple = new Subway("7호선");
		tomas.takeSubway(purple);
		tomas.showInfo();
		purple.showInfo();
		
	}

}
