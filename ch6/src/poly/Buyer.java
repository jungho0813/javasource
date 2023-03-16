package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product cart[] = new Product[5]; //구입한 제품을 저장하기 위한 배열
	int i=0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없습니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+" 을/를 구매하셨습니다.");
		
	}

}
