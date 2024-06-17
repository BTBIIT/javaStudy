package singleton;

public class CardCompanyTest {
//	카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. 06-3의 학번 생성하기〉 
//	예제를 참고하여 카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 
//	만들고 생성해 보세요
	public static void main(String[] args) {
		CardCompany card = CardCompany.getInstance();	//card로 CardCompany의 Intance에 접근
		
		
		Card mycard = card.createCard();		// 고객1 내 카드
		Card momcard = card.createCard();		// 고객2 엄마 카드
		Card fathercard = card.createCard();	// 고객3 아빠 카드
		
		System.out.println(mycard.getCardNum());	
		System.out.println(momcard.getCardNum());
		System.out.println(fathercard.getCardNum());
	}

}
