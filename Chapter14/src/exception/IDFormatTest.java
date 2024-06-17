package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	// 입력값 Validation 체크 
	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 설정 해야합니다");
		}
		this.userID = userID;
	}
	
	public static void main(String [] args) {
		// 사용자 정의 예외 테스트
		IDFormatTest test = new IDFormatTest();
		// ID가 null인 경우
		String userID = null;
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	
		// ID가 7자 인경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	
	
	
	
	
	
	
	
	
	
	}
}
