package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		//입력값으로 GoodsStock 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("상품코드 >> ");
//		String code = sc.nextLine();
//		System.out.print("재고수량 >> ");
//		int stockNum = Integer.parseInt(sc.nextLine());
		
//		GoodsStock goods = new GoodsStock(code,stockNum);
		
//		System.out.println(goods);
		
		GoodsStock[] goods = new GoodsStock[3];
		
		for (int i = 0; i < goods.length; i++) {
			System.out.print("상품코드 >> ");
			String code = sc.nextLine();
			System.out.print("재고수량 >> ");
			int stockNum = Integer.parseInt(sc.nextLine());
			goods[i] = new GoodsStock(code,stockNum);
			System.out.println("---------------------------");
		}
		
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
		
		
		
		
	}

}
