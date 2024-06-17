package corporation;

public class Person {
	String personName;
	int money;
	
	//생성자
	public Person(String personName, int money) {
		this.personName = personName;
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		String msg = starCoffee.brewing(money);
		if(money == 4000) {
			this.money -= 4000;
		}else if(money == 5600) {
			this.money -= 5600;
		}else {
			
		}
		if(msg != null) {
			System.out.println(personName + "님 께서는 " + money + "원을 내고 " + msg);	
		}
		System.out.println(personName + "님의 남은 돈은 " + this.money + "입니다.");
	}

	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		String msg = beanCoffee.brewing(money);
		if (money == 5000) {
			this.money -= 5000;
		}else if(money == 4500) {
			this.money -= 4500;
		}else {

		}
		if(msg != null) {
			System.out.println(personName + "님 께서는 " + money + "원을 내고 " + msg);	
		}
		System.out.println(personName + "님의 남은 돈은 " + this.money + "입니다.");
	}
	
//	public void showInfo() {
//
//		System.out.println(personName + "님의 남은 돈은 " + money + "입니다.");
//	}
	
}
