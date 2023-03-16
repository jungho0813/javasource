package ch4;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		//주사위 5번 던지기
		
		for (int i = 0; i < 5; i++) {
			int dice=(int)(Math.random()*6)+1;
			System.out.println(dice);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("5 x %d = %d\n",i,(i*5));
		}
		System.out.println();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출력을 원하는 단을 입력하세요");
//		int num = Integer.parseInt(sc.nextLine());
//		for (int i = 0; i < 10; i++) {
//	    System.out.printf("%d x %d = %d\n",num,i,(num*i));
//		}
		
		//3의 배수와 5의 배수 합 구하기 ( 단 1~100 사이의 숫자)
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			//i가 3의 배수인지 or 5의 배수인지 확인하는 코드
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		System.out.printf("3과 5의 배수 합 = "+sum);
		sum=0;
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 && i%9!=0) {
				sum+=i;

			}
		}
		System.out.println();
		System.out.println("3의 배수 합(단 9의배수제외)"+sum);
		
		
		
		
		
		
		
	}

}
