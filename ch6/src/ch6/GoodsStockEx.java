package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		// 티셔츠 상품관리
		// 객체 생성
		GoodsStock goods = new GoodsStock("p123456",200);
		
		System.out.println("현재 재고수량 : "+goods.stockNum);
		System.out.println("상품코드 : "+goods.Code);
		
		
	}

}
