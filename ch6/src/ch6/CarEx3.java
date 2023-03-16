package ch6;

import java.util.Scanner;

public class CarEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("회사명 >> ");
//		String company = sc.nextLine();
//		System.out.print("모델명 >> ");
//		String model = sc.nextLine();
//		System.out.print("색상 >> ");
//		String color = sc.nextLine();
//		System.out.print("최대속도 >> ");
//		int maxSpeed = Integer.parseInt(sc.nextLine());
//		
//		Car3 car = new Car3(company, model, color, maxSpeed);
//		
//		System.out.println(car);
		
		// 입력값으로 Car3 인스턴스를 3개 생성 ==> 배열
		// 배열 선언, 생성
		Car3 cars[] = new Car3[3];
		
		for (int i = 0; i < cars.length; i++) {
			System.out.print("회사명 >> ");
			String company = sc.nextLine();
			System.out.print("모델명 >> ");
			String model = sc.nextLine();
			System.out.print("색상 >> ");
			String color = sc.nextLine();
			System.out.print("최대속도 >> ");
			int maxSpeed = Integer.parseInt(sc.nextLine());
		}
		

		
	}

}
