package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// 
		Student lee = new Student(1001, "이순신");
		
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 90);
		
		lee.showStudentInfo();
		
		System.out.println("======================================================");
		
		Student kim = new Student(1002, "김유신");
		
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 80);
		kim.addSubject("영어", 100);
		
		kim.showStudentInfo();
		

	}

}
