package homework;

abstract class Pet {
    abstract public void walk(); // 추상 메소드
    abstract public void eat(); // 추상 메소드
    
    public int health; // 인스턴스 필드
    public void run() {  // 인스턴스 메소드
    	System.out.println("뛰어 뛰어");
    }
}

class Dog extends Pet {
	// 상속 받은 부모(추상) 메소드를 직접 구현
    public void walk() {
        System.out.println("개가 네 발로 걷습니다");
    }
    public void eat() {
    	System.out.println("개가 먹습니다");
    }
}

public class Pets {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // 부모(추상) 클래스로 부터 상속받은 추상 메소드를 직접 구현한 메소드를 실행
        dog.walk();
        dog.run(); // 부모(추상) 클래스의 인스턴스 메소드 실행
    }
}
