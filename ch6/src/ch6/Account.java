package ch6;

public class Account {
	//속성
	//계좌번호
	String accountNo;
	//계좌주
	String owner;
	//잔액
	int balance;

	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//기능
	//예금,인출
	int deposit(int amount) {
		balance = balance+amount;
		return balance;
	}
	int withdraw(int amount) {
		if (balance>amount) {
				balance-=amount;
			
		}
		return balance;
		
	}
	
	

}
