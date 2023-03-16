package ch4;

import java.util.Scanner;

public class WhileEx4 {
	public static void main(String[] args) {
		//while, Math.random() 사용
		//두개의 주사위를 던져 나오는 값을 (값1, 값,2) 형태로 출력하고
		//값의 합이 5가 아니면 계속 주사위를 던지고, 5인경우 실행 종료
		
		int num=5;
		while (true) {
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;					
			
			System.out.printf("(%d, %d)\n",dice1,dice2);
			
			if(dice1+dice2==5)break;
		}
		
		
		
		
		
		
	}

}
