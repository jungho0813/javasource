package ch7;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account("123-123", "홍", 100000);
		
		account.withdraw(500000);
	}

}
