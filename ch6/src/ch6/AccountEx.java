package ch6;

public class AccountEx {

	public static void main(String[] args) {
		Account account1 = new Account("110-373-593341", "홍", 1000);
		Account account2 = new Account("110-373-593341", "김", 200000);
		
		//홍 계좌 입/출금 기능
		System.out.println(account1.owner);
		System.out.println("=====================");
		System.out.println("현재잔액 : "+account1.deposit(500000));
		System.out.println("현재잔액 : "+account1.withdraw(230000));
		
		System.out.println();
		//김 계좌 입/출금 기능
		System.out.println(account2.owner);
		System.out.println("=====================");
		System.out.println("현재잔액 : "+account2.deposit(300000));
		System.out.println("현재잔액 : "+account2.withdraw(120000));
	}

}
