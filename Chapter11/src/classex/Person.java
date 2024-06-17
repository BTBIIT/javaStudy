package classex;

public class Person {
	
	//멤버변수
	public String name;
	public int age;

	
	/*
	생성자
	 */
	
	//1
	public Person() {}
	//2
	public Person(String name) {
		this.name = name;
	}
	//3
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/* 
	getter setter
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
