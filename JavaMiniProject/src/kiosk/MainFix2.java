package kiosk;

import java.util.Scanner;


public class MainFix2 {

	public static void main(String[] args) {
		// Kiosk Main Program

		// 고객정보 
		int cash;
		int point;
		// 밑에서 필요한 생성자
		//JHReceipt receipt = new JHReceipt();	
		// 필요한 int 정보
		int burger = 0;
		int burgerPrice = 0;
		int setIndex = 0;
		int plusTopping = 0;
		int ptIndex = 0;
		int side = 0;
		int sideIndex = 0;
		int juice = 0;
		int drinkIndex = 0;
		int largeDrinkIndex = 0;
		int paymentAmount = 0;
		int yn = 0; // 영수증 총 합계
		// Scanner System Open
		Scanner kioskMain = new Scanner(System.in);
		System.out.println(Color.purple
				+ "======================================================================================");
		System.out.println("||\t\t        고객님이 가지신 Cash와 Point를 공백으로 구분하여 입력해 주세요.          ||");
		System.out.println(
				"======================================================================================" + Color.exit);
		cash = kioskMain.nextInt();
		point = kioskMain.nextInt();
		GuestInfo gi = new GuestInfo(cash, point);
		boolean menuSelect = true; // 메뉴선택 창
		while (menuSelect) { // Main에서 가장 큰 while문
			System.out.println(
					Color.red + "======================================================================================"
							+ Color.exit);
			System.out.println(Color.red + "||             \t\t\t어서오세요 -KOTTE RIA- 입니다.\t\t\t    ||\n||"
					+ "           \t\t\t원하시는 메뉴를 아래에서 선택해 주세요.\t\t\t    ||\n||"
					+ "          \t\t\t원하시는 메뉴가 없으시면 [0]번을 눌러주세요.\t\t    ||" + Color.exit);
			System.out.println(
					Color.red + "======================================================================================"
							+ Color.exit);
			System.out.println("1. 불고기버거[4,600 \u20A9] \t 2. 치즈버거[5,200 \u20A9] \t\t 3. 새우버거[5,200 \u20A9]");
			System.out.println("4. 치킨버거[5,500 \u20A9] \t 5. 베이컨치즈버거[6,500 \u20A9] \t 6. 더블비프치즈버거[7,900 \u20A9]");
			System.out.println("7. 스페셜버거[8,900 \u20A9]");
			
			// 메인메뉴(버거 선택 || 버거만, 세트)
			burger = kioskMain.nextInt(); // 햄버거 // 햄버거의 Index 값 (-1한 값)
			switch (burger) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				burgerPrice = SHMenu2.burgerPrice[burger - 1];
				boolean sett = true;
				while (sett) { // 개별적으로 분리된 while 문(1) : 단품 / 세트 선택
					System.out.println(Color.green
							+ "======================================================================================"
							+ Color.exit);
					System.out.println("단품과 세트 중 선택해주세요. [세트 : 버거 + 감자튀김 + 콜라]");
					System.out.println("1. 단품\t \t 2. 세트[+3,500 \u20A9]");

					setIndex = kioskMain.nextInt(); // 세트 단품 여부 세트시 + 3500원
					if (setIndex == 2) {
						burgerPrice = SHMenu2.setPrice[burger-1];
					} else {
						burgerPrice += 0;
					}
					break;
				}
				boolean plustopping = true;
				while (plustopping) { // 개별적으로 분리된 while 문(2) : 토핑 추가 여부 선택
					System.out.println(Color.green
							+ "======================================================================================"
							+ Color.exit);
					System.out.println("토핑을 추가하시겠습니까?\n" + "추가를 원치 않으시면 [5]번을 눌러주세요.");
					System.out.println(
							"1. 토마토 [600 \u20A9] \t 2.치즈 [800 \u20A9]\n3. 베이컨 [1,600 \u20A9] \t 4. 비프패티 [2,500 \u20A9]\n5. 추가하지 않음");
					ptIndex = kioskMain.nextInt(); // 토핑 // 토핑의 Index
					switch (ptIndex) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						plusTopping = SHMenu2.addToppingPrice[ptIndex - 1];
						plustopping = false;
						break;
					default:
						System.out.println("원하시는 토핑의 번호를 눌러주세요.");
					}

				}

				// 사이드 메뉴 선택 창
				boolean sideMenu = true; // 개별적으로 분리된 while문(3) : 사이드 메뉴 선택 창
				while (sideMenu) {
					System.out.println(Color.green
							+ "======================================================================================"
							+ Color.exit);
					System.out.println("추가상품을 원하십니까? 아래에서 골라주세요.\n" + "원치 않으시면 [7]번을 눌러주세요.");
					System.out.println("1. 프렌치프라이[2,100 \u20A9]\t 2.양념감자[2,600 \u20A9]\t 3.치즈스틱[2,600 \u20A9]");
					System.out.println("4. 치킨너겟[2,900 \u20A9]\t 5.오징어링[2,800 \u20A9]\t 6.콘샐러드[1,900 \u20A9]");
					System.out.println("7. 아무것도 필요하지 않음");
					sideIndex = kioskMain.nextInt(); // side메뉴 번호 // 사이드의 Index 값 (-1한 값)
					switch (sideIndex) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
						side = SHMenu2.sideMenuPrice[sideIndex - 1];
						sideMenu = false;
						break;
					default:
						System.out.println("\t\t원하시는 사이드 메뉴의 번호를 선택해 주세요.");
					}
				}
				boolean drink = true;
				while (drink) { // 개별적으로 분리된 while문(4) : 음료 메뉴 선택 창
					System.out.println("추가 음료를 선택해 주세요.\n" + "필요하지 않으신 경우 9번을 눌러주세요.");
					System.out.println(
							"1. 콜라[2,000 \u20A9]\t 2. 사이다[2,000 \u20A9]\t 3. 아이스티[2,300 \u20A9]\t 4. 아메리카노[2,500 \u20A9]");
					System.out.println(
							"5. 레몬에이드[2,700 \u20A9]\t 6. 우유[1,500 \u20A9]\t 7. 핫초코[2,500 \u20A9]\t 8. 생수[1,000 \u20A9]");
					drinkIndex = kioskMain.nextInt(); // 음료의 인덱스 번호 // 음료의 Index 값(-1한 값)
					switch (drinkIndex) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
						juice = SHMenu2.drinkPrice[drinkIndex - 1];
						System.out.println("음료의 사이즈를 올리시겠습니까? 1. 예 [+700 \u20A9]\t2. 아니오");
						largeDrinkIndex = kioskMain.nextInt();
						if (largeDrinkIndex == 1) {
							juice = SHMenu2.drinkSizeUpPrice[drinkIndex-1];
						} else {
							juice += 0;
						}
						drink = false;
						break;
					case 0:
						juice = SHMenu2.drinkPrice[8];
						drink = false;
						break;
					case 9:
						largeDrinkIndex = 2;
						juice = SHMenu2.drinkPrice[drinkIndex - 1];
						drink = false;
						break;
					default:
						System.out.println("원하시는 음료의 번호를 눌러주세요.");
					}
				}

				line(10);
				// 결제창
				boolean payment = true;
				paymentAmount = burgerPrice + side + juice + plusTopping; // 가격 총액 확인
				while (payment) {
					System.out.println(Color.blue
							+ "======================================================================================");
					System.out.println("||\t\t\t\t결제방법을 선택해주세요.\t\t\t\t    ||");
					System.out.println("||\t\t\t\t1. 카드 \t 2. 현금 \t 3. 포인트 사용\t\t\t    ||");
					System.out.println("||\t\t\t\t이전 화면으로 돌아가려면 [0]번을 눌러주세요.\t\t    ||");
					System.out.println(
							"======================================================================================"
									+ Color.exit);
					int paymentMethod = kioskMain.nextInt();
					gi.paymentAmount = paymentAmount;
					line(10);
					switch (paymentMethod) {
					case 1:
						gi.paymentCard();
						menuSelect = false;
						payment = false;
						break;
					case 2:
						gi.paymentCash();
						menuSelect = false;
						payment = false;
						break;
					case 3:
						JHReceipt.point = gi.point;
						gi.paymentPoint();
						paymentAmount = paymentAmount - gi.point;
						menuSelect = false;
						payment = false;
						break;
					case 0:
						payment = false;
						break;
					default:
						System.out.println("결제 방법을 올바르게 선택해주세요.");
					}
				}
				break;

			case 0:
				System.out.println(Color.purple + "\t\t\t\t\t\t다음에 또 방문해주세요.");
				menuSelect = false;
				break;

			default:
				System.out.println(Color.red + "\t\t\t원하시는 메뉴를 선택해 주세요." + Color.exit);
			}
		}
		
		boolean reCeipt = true;
		if (cash < paymentAmount) {
			reCeipt = false;	
		} else {
			reCeipt = true;
		}
		
		while (reCeipt) {
			for (int i = 0; i <= 20; i++) {
				System.out.println(Color.blue + "\t\t\t.\t\t\t" + Color.exit);
			}

			System.out.println("영수증을 출력하시겠습니까?");
			System.out.println();
			yn = kioskMain.nextInt();
			switch (yn) {
			case 1:
				if (setIndex == 1 && largeDrinkIndex == 2) { // 단품 / 작은음료
					JHReceipt.addProduct(SHMenu2.burger[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drink[drinkIndex - 1]);
					//JHReceipt.point = gi.poi
					JHReceipt.printReceipt();
					break;
				} else if (setIndex == 2 && largeDrinkIndex == 2) { // 세트 / 작은음료
					JHReceipt.addProduct(SHMenu2.burgerset[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drink[drinkIndex - 1]);
					JHReceipt.printReceipt();
					break;
				} else if (setIndex == 1 && largeDrinkIndex == 1) { // 단품 / 큰 음료
					JHReceipt.addProduct(SHMenu2.burger[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drinkSizeUp[drinkIndex - 1]);
					JHReceipt.printReceipt();
					break;
				} else if (setIndex == 2 && largeDrinkIndex == 1) { // 세트 / 큰 음료
					JHReceipt.addProduct(SHMenu2.burgerset[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drinkSizeUp[drinkIndex - 1]);
					JHReceipt.printReceipt();
					break;
				}
				break;
			case 2:
				if (setIndex == 1 && largeDrinkIndex == 2) { // 단품 / 작은음료
					JHReceipt.addProduct(SHMenu2.burger[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drink[drinkIndex - 1]);
					JHReceipt.notreceipt();
					break;
				} else if (setIndex == 2 && largeDrinkIndex == 2) { // 세트 / 작은음료
					JHReceipt.addProduct(SHMenu2.burgerset[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drink[drinkIndex - 1]);
					JHReceipt.notreceipt();
					break;
				} else if (setIndex == 1 && largeDrinkIndex == 1) { // 단품 / 큰 음료
					JHReceipt.addProduct(SHMenu2.burger[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drinkSizeUp[drinkIndex - 1]);
					JHReceipt.notreceipt();
					break;
				} else if (setIndex == 2 && largeDrinkIndex == 1) { // 세트 / 큰 음료
					JHReceipt.addProduct(SHMenu2.burgerset[burger - 1]);
					JHReceipt.addProduct(SHMenu2.addTopping[ptIndex - 1]);
					JHReceipt.addProduct(SHMenu2.sideMenu[sideIndex - 1]);
					JHReceipt.addProduct(SHMenu2.drinkSizeUp[drinkIndex - 1]);
					JHReceipt.notreceipt();
					break;
				}
				break;
			}
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println();
			line(20);
			break;

		}

		// Scanner System Close
		kioskMain.close();

	}

public int lineCount;
public static void line(int lineCount) {
		for(int i = 0; i<lineCount; i++) {
		System.out.println();
	}
}

}

