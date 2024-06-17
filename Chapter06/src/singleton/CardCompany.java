package singleton;

public class CardCompany {
	//생성자 및 기본 호출 생성
	private static CardCompany instance = new CardCompany();
	CardCompany(){}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
		
	}

	public Card createCard() {	//createCard가 선언될 때 마다 Card를 생성함
		Card card = new Card();
		return card;
	}

}
