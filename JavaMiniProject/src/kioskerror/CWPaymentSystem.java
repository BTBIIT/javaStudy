package kioskerror;

// 결제 시스템 인터페이스
public interface CWPaymentSystem {
    // 결제 방식에 대한 추상 메서드
    void paymentCard();
    void paymentCash();
    void paymentPoint();
}

// 고객 정보 클래스
class GuestInfo implements CWPaymentSystem{
    // 멤버변수 선언
    public int cash; // 고객이 가진 현금
    public int point; // 고객이 가진 포인트
    public int earnedPoint; // 결제 시 적립된 포인트
    public int paymentAmount; // 결제 금액
    public boolean isPaymentCompleted; // 결제 완료 여부
    private int choice;
    // 생성자 - 초기 현금과 포인트를 설정
    public GuestInfo(int cash, int point) {
        this.cash = cash;
        this.point = point;
    }

    @Override
    public String toString() {
    	return "재산 : " + cash+"\n"+"포인트 : "+point;
    
    // 여기에 메소드 정의
    
    
    
    }

}

	

// 결제 방식 클래스 - GuestInfo를 상속받고 PaymentSystem 인터페이스 구현
class PaymentMethod extends GuestInfo implements CWPaymentSystem {
    private int choice;

   // 생성자 - 상위 클래스의 생성자 호출
    PaymentMethod(int cash, int point) {
        super(cash, point);
    }

    // 카드 결제 메서드
    @Override
    public void paymentCard() {		// payment 2
        System.out.println("카드로 결제를 진행합니다.");
        if (cash >= paymentAmount) {
            System.out.println("결제 금액은 " + paymentAmount + "원 입니다.");
            System.out.println("결제가 성공하였습니다.");
            cash -= paymentAmount; // 결제 금액 차감
            isPaymentCompleted = true; // 결제 완료 표시
            earnedPoint = (int) (paymentAmount * 0.01); // 적립 포인트 계산
            point += earnedPoint; // 포인트 적립
        } else {
            System.out.println("결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다.");
            isPaymentCompleted = false; // 결제 실패 표시
        }
        System.out.println("현재 포인트는 " + point + "점 입니다.");
    }

    // 현금 결제 메서드
    @Override
    public void paymentCash() {		// payment 1
        System.out.println("현금으로 결제를 진행합니다.");
        if (cash >= paymentAmount) {
            System.out.println("결제 금액은 " + paymentAmount + "원 입니다.");
            System.out.println("결제가 성공하였습니다.");
            cash -= paymentAmount; // 결제 금액 차감
            isPaymentCompleted = true; // 결제 완료 표시
            earnedPoint = (int) (paymentAmount * 0.01); // 적립 포인트 계산
            point += earnedPoint; // 포인트 적립
        } else {
            System.out.println("결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다.");
            isPaymentCompleted = false; // 결제 실패 표시
        }
        System.out.println("현재 포인트는 " + point + "점 입니다.");
    }    

    // 포인트 결제 메서드
    @Override
    public void paymentPoint() {
        System.out.println("포인트로 결제를 진행합니다.");
        if (point >= paymentAmount) {
            System.out.println("결제 금액은 " + paymentAmount + "점 입니다.");
            System.out.println("결제가 성공하였습니다.");
            point -= paymentAmount; // 포인트 차감
            isPaymentCompleted = true; // 결제 완료 표시
        } else {
            System.out.println("결제 포인트가 부족합니다. 현재 포인트는 " + point + "점 입니다.");
            // 부족한 포인트만큼 추가 결제 시도
            int remainingAmount = paymentAmount - point; // 부족한 금액 계산
            point = 0; // 모든 포인트 사용
            System.out.println("추가 결제할 금액은 " + remainingAmount + "원 입니다.");
            // 추가 결제 방법 선택
            additionalPayment(remainingAmount);
        }
        System.out.println("현재 포인트는 " + point + "점 입니다.");
    }

    // 추가 결제 메서드
    public void additionalPayment(int remainingAmount) {
        System.out.println("추가 결제 방법을 선택해 주세요: 1. 카드 2. 현금");
        
        if (choice == 1) {
            System.out.println("카드로 추가 결제를 진행합니다.");
            if (cash >= remainingAmount) {
                System.out.println("추가 결제 금액은 " + remainingAmount + "원 입니다.");
                cash -= remainingAmount; // 추가 결제 금액 차감
                isPaymentCompleted = true; // 결제 완료 표시
                earnedPoint = (int) (remainingAmount * 0.01); // 적립 포인트 계산
                point += earnedPoint; // 포인트 적립
                System.out.println("결제가 성공하였습니다.");
            } else {
                System.out.println("추가 결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다.");
                isPaymentCompleted = false; // 결제 실패 표시
            }
        } else if (choice == 2) {
            System.out.println("현금으로 추가 결제를 진행합니다.");
            if (cash >= remainingAmount) {
                System.out.println("추가 결제 금액은 " + remainingAmount + "원 입니다.");
                cash -= remainingAmount; // 추가 결제 금액 차감
                isPaymentCompleted = true; // 결제 완료 표시
                earnedPoint = (int) (remainingAmount * 0.01); // 적립 포인트 계산
                point += earnedPoint; // 포인트 적립
                System.out.println("결제가 성공하였습니다.");
            } else {
                System.out.println("추가 결제 금액이 부족합니다. 현재 잔액은 " + cash + "원 입니다.");
                isPaymentCompleted = false; // 결제 실패 표시
            }
        } else {
            System.out.println("잘못된 선택입니다. 결제를 종료합니다.");
            isPaymentCompleted = false; // 결제 실패 표시
        }
    }
}