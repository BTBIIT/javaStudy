package singleton;

public class Card {
	private int cardNum;
	private int cardNum2;
	private String cardSpell;
	private String cardSpell2;
	private static int serialNum2 = 0;
	private static int serialNum = 000;
	
	Card (){
		serialNum++;
		serialNum2 = serialNum2 + 1000;
		cardSpell = "AAAA";
		cardSpell2 = "-BBBB-";
		cardNum2 = serialNum2;
		cardNum = serialNum;
	}	//Card 가 생성될 때 마다 serialNum2와 serialNum이 증가

	public String getCardNum() {
		return cardSpell + cardSpell2 + cardNum2 + "-000" +cardNum;
	}



}

