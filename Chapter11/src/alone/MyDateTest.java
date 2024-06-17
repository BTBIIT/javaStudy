package alone;

class MyDate extends Object{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	// 여기에 코드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate myd = (MyDate)obj;
			return (this.day == myd.day && this.month == myd.month && this.year == myd.year);
		}
		return false;
		}

	@Override
	public int hashCode() {
		return (10000*year) + (100*month) + day;			//yyyymmdd 
	}


}

public class MyDateTest {

	public static void main(String[] args) {
		// equals 재정의 연습
		// 날짜가 같으면 
		// true가 되도록 equals 재정의 하세요
		MyDate date1 = new MyDate(20, 5, 2024);
		MyDate date2 = new MyDate(20, 5, 2024);
		MyDate date3 = new MyDate(4, 9, 1994);
//		System.out.println(date1.equals(date2));
//		System.out.println(date1.equals(date3));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(date1.hashCode() == date2.hashCode());
		System.out.println(date1.hashCode() == date3.hashCode());
	
	}
	
}

