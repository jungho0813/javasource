package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("110-11", "홍", 100000, "123-123");
		
		//카드번호 다를때
		checkingAccount.pay("142-142", 50000);
		
		//카드번호 동일할때
		int balance = checkingAccount.pay("123-123", 50000);
		System.out.println("사용액 지불 후 잔액 "+balance);
		
	}

}
