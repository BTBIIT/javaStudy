package kiosk;
import java.util.Scanner;
// 결제 시스템 인터페이스
public interface CWPaymentSystem2 {
    // 결제 방식에 대한 추상 메서드
    void paymentCard();
    void paymentCash();
    void paymentPoint();
}

// 고객 정보 클래스
class GuestInfo implements CWPaymentSystem2 {
    // 멤버변수 선언
    public int cash; // 고객이 가진 현금
    public int point; // 고객이 가진 포인트
    public int earnedPoint; // 결제 시 적립된 포인트
    public int paymentAmount; // 결제 금액
    public boolean isPaymentCompleted; // 결제 완료 여부
    public int choice; // 결제 방법 선택 변수

    // 생성자 - 초기 현금과 포인트를 설정
    public GuestInfo(int cash, int point) {
        this.cash = cash;
        this.point = point;
    }

    // choice 설정 메서드
    public void setChoice(int choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "재산 : " + cash + "\n" + "포인트 : " + point;
    }

    // 카드 결제 메서드
    @Override
    public void paymentCard() {
        System.out.println(Color.blue+"---------------------------------------------------------------------------------------");
        System.out.println("카드로 결제를 진행합니다.");
        System.out.println("---------------------------------------------------------------------------------------"+Color.exit);
        if (cash >= paymentAmount) {
            System.out.println(Color.blue+"결제 금액은 " + paymentAmount + "원 입니다.");
            System.out.println("결제가 성공하였습니다."+Color.exit);
            cash -= paymentAmount; // 결제 금액 차감
            isPaymentCompleted = true; // 결제 완료 표시
            earnedPoint = (int) (paymentAmount * 0.01); // 적립 포인트 계산
            point += earnedPoint; // 포인트 적립
        } else {
            System.out.println(Color.blue+"결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다."+Color.exit);
            isPaymentCompleted = false; // 결제 실패 표시
        }
        System.out.println(Color.blue+ "현재 포인트는 " + point + "점 입니다.");
        System.out.println("---------------------------------------------------------------------------------------"+Color.exit);
    }

    // 현금 결제 메서드
    @Override
    public void paymentCash() {
    	System.out.println(Color.blue+"---------------------------------------------------------------------------------------");
    	System.out.println("현금으로 결제를 진행합니다.");
    	System.out.println("---------------------------------------------------------------------------------------"+Color.exit);
        if (cash >= paymentAmount) {
            System.out.println(Color.blue+"결제 금액은 " + paymentAmount + "원 입니다.");
            System.out.println("결제가 성공하였습니다."+Color.exit);
            cash -= paymentAmount; // 결제 금액 차감
            isPaymentCompleted = true; // 결제 완료 표시
            earnedPoint = (int) (paymentAmount * 0.01); // 적립 포인트 계산
            point += earnedPoint; // 포인트 적립
        } else {
            System.out.println(Color.blue+"결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다."+Color.exit);
            isPaymentCompleted = false; // 결제 실패 표시
        }
        System.out.println(Color.blue+"현재 포인트는 " + point + "점 입니다."+Color.exit);
    }

    // 포인트 결제 메서드
    @Override
    public void paymentPoint() {
    	System.out.println(Color.blue+"---------------------------------------------------------------------------------------");
        System.out.println("포인트로 결제를 진행합니다.");
        System.out.println("---------------------------------------------------------------------------------------"+Color.exit);
        if (point >= paymentAmount) {
            System.out.println(Color.blue+"결제 금액은 " + paymentAmount + "점 입니다.");
            System.out.println("결제가 성공하였습니다."+Color.exit);
            point -= paymentAmount;
            isPaymentCompleted = true;
        } else {
            System.out.println(Color.blue+"결제 포인트가 부족합니다. 현재 포인트는 " + point + "점 입니다.");
            int remainingAmount = paymentAmount - point;
            point = 0;
            System.out.println("추가 결제할 금액은 " + remainingAmount + "원 입니다."+Color.exit);
            additionalPayment(remainingAmount);
        }
        System.out.println(Color.blue+"현재 포인트는 " + point + "점 입니다."+Color.exit);
    }

    // 추가 결제 메서드
    private void processPayment(int amount, String method) {
        if (cash >= amount) {
            System.out.println(Color.blue+"결제 금액은 " + amount + "원 입니다.");
            System.out.println("결제가 성공하였습니다."+Color.exit);
            cash -= amount;
            isPaymentCompleted = true;
            earnedPoint = (int) (amount * 0.01);
            point += earnedPoint;
        } else {
            System.out.println(Color.blue+"결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다."+Color.exit);
            isPaymentCompleted = false;
        }
    }

    public void additionalPayment(int remainingAmount) {
        System.out.println(Color.blue+"추가 결제 방법을 선택해 주세요: 1. 카드 2. 현금"+Color.exit);
        
        // 사용자로부터 입력을 받는 부분 추가
        Scanner scanner = new java.util.Scanner(System.in);
        int choice = scanner.nextInt();
        setChoice(choice);
        if (choice == 1) {
            System.out.println(Color.blue+"카드로 추가 결제를 진행합니다."+Color.exit);
            processPayment(remainingAmount, "카드");
        } else if (choice == 2) {
            System.out.println(Color.blue+"현금으로 추가 결제를 진행합니다."+Color.exit);
            processPayment(remainingAmount, "현금");
        } else {
            System.out.println(Color.blue+"잘못된 선택입니다. 결제를 종료합니다."+Color.exit);
            isPaymentCompleted = false;
        }
    
    }
}
  