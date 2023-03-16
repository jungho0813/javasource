package inheritance;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		CheckingTrafficCardAccount  checkingTrafficCardAccount = new CheckingTrafficCardAccount("11-111", "홍", 100000, "123-123", false);


		CheckingTrafficCardAccount  checkingTrafficCardAccount2 = new CheckingTrafficCardAccount("11-111", "홍", 100000, "123-123", true);
		
		//교통카드 기능이 없을때
		checkingTrafficCardAccount.payTracfficCard("123-123", 1000);
		
		
		//교통카드 기능이 있을때 - 카드번호 일치
		System.out.println(checkingTrafficCardAccount2.payTracfficCard("123-123", 1000));
	
		//교통카드 기능이 있을때 - 카드번호 불일치
		System.out.println(checkingTrafficCardAccount2.payTracfficCard("1234-123", 1000));
		
	
	
	
	}

}
