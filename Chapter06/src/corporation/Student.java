package corporation;

public class Student {
		// 멤버변수
		public String studentName;	// 학생이름
		public int grade;			// 학년
		public int money;			// 용돈
	
		// 생성자
		public Student(String studentName, int money) {
			this.studentName = studentName;
			this.money = money;
		}

		public void takeBus(Bus bus) {
			bus.take(1000);
			this.money -=1000;		// this.money = this.money - 1000;
			// 학생이 버스를 타면 1,000원을 지불하는 기능
		}
		
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money -=1500;
			// 학생이 지하철을 타면 1,500원을 지불하는 기능
		}

		public void showInfo() {
			System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
		}




}
