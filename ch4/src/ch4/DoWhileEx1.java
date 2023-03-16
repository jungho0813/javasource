package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
	public static void main(String[] args) {
		
		// do~while
		// while 문 변형으로 조건식과 블럭의 순서를 바꿔놓은것
		// 조건식이 만족하지 않아도 블럭이 한번은 수행됨
		
		int input=0;
		
		do {
			System.out.println("Hello");
		}while(input!=0);
		
	}

}
