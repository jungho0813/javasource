package poly;

public class ProductEx {
	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer buyer = new Buyer();
		
		//Tv 구매하다
//		Tv1 tv1 = new Tv1();
//		buyer.buy(tv1);
		buyer.buy(new Tv1());
		
//		Computer computer = new Computer();
//		buyer.buy(computer);
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+buyer.money+"만원 입니다.");
		System.out.println("현재 보너스 점수는 "+buyer.bonusPoint+"점 입니다");
	}

}
