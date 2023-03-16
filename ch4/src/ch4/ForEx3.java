package ch4;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 숫자 입력");
		int num = Integer.parseInt(sc.nextLine());
		
		int fact=1;
		for (int i = num; i >= 1; i--) {
		 fact=fact*i;
		}
		System.out.printf("%d! = %d",num,fact);
		
	}

}
