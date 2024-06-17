package corporation;

public class DrinkCoffee {

	public static void main(String[] args) {
		// 김씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
		// 이씨는 콩다방에서 4,500원을 내고 라떼를 사 마셨습니다.
		Person kim = new Person("Kim", 100000);
		StarCoffee starCoffee = new StarCoffee();
		
		Person lee = new Person("Lee", 100000);
		BeanCoffee beanCoffee = new BeanCoffee();
		
		
		kim.buyStarCoffee(starCoffee, 4000);
//		kim.showInfo();
		lee.buyBeanCoffee(beanCoffee, 4500);	
//		lee.showInfo();
	
	
	}

}

