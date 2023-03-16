package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccount{
	//은행 + 체크카드 + 교통카드
	
	private boolean hasTrafficCard; //교통카드 사용여부

	public CheckingTrafficCardAccount(String ano, String owner, int balance, String cardNo, boolean hasTrafficCard) {
		super(ano, owner, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	
	//교통비 지불
	//카드번호, 사용액 매개변수로 받아서 교통카드 기능이 있다면 지불처리
	//교통카드 기능이 없다면 교통카드 기능이 없습니다 메세지 출력
	int payTracfficCard(String cardNo, int amount) {
		if(!hasTrafficCard) {
			System.out.println("교톻카드 기능이 없습니다");
			return 0;
		}
		//카드번호 일치하고 잔액이 있다면 지불 처리
		return pay(cardNo,amount);
		
	}
	
}
