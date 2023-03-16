package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount creditLineAccount = new CreditLineAccount("123-123", "홍", 100000, 5000000);
		
		//금액이 큰경우
		System.out.println("사용액 : "+creditLineAccount.withdraw(6000000));
		System.out.println("잔액 : "+creditLineAccount.getBalance());
		
		System.out.println();
		
		//금액이 작은경우
		System.out.println("사용액 : "+creditLineAccount.withdraw(4000000));
		System.out.println("잔액 : "+creditLineAccount.getBalance());
	}

}
