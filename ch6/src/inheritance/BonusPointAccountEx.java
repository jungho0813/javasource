package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonusPointAccount = new BonusPointAccount("123-123", "1", 0, 0);
		//예금액 : 100000
		//현재보너스포인트 :
		int amount = 100000;
		bonusPointAccount.deposit(amount);
		
		System.out.println("예금액 : "+amount);
		System.out.println("현재보너스포인트 : "+bonusPointAccount.getBonusPoint());
		
	}

}
