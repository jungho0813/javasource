package ch6;

//상품관리

public class GoodsStock {
	//속성  
	//상품코드
	String Code;
	//재고수량
	int stockNum;
	
	//생성자를 하나도 명시하지 않으면
	//기본생성자를 알아서 생성해줌
	
	//생성자 생성
	public GoodsStock(String code, int stockNum) {
		super();
		Code = code;
		this.stockNum = stockNum;
	}
	
	
	//기능
	//재고수량 감소
	void addStock() {
		System.out.println("재고수량 증가");
	}
	//재고수량 증가
	void subtracktStock() {
		System.out.println("재고수량 감소");
		
	}


	@Override
	public String toString() {
		return "GoodsStock [Code=" + Code + ", stockNum=" + stockNum + "]";
	}
	
	
}
