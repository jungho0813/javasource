package ch4;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx4 {
	public static void main(String[] args) {

		// 중첩 for
		// for문 안에 for포함
//		for (int i = 0; i < 5; i++) {
//		  for (int j = 0; j < 10; j++) {
//			System.out.print("*");
//			}
//		System.out.println();
//		}
//		System.out.println();
//
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
//		

		//  4x+5y=60 의 모든 해 구하기
	
		//  단, x,y는 10이하의 자연수
			
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(4*i+5*j==60) {
					System.out.printf("(%d, %d)\n",i,j);
				}
				
			}
			
		}
		
		//break;
		//자신이 포함된 가장 가까운 반복문을 벗나게됨 (주로 if와 같이 사용)
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==5) break;
		}
		System.out.println();
		
		//continue;
		//반복문 내에서만 사용
		//반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여
		//다음 반복으로 넘어감
		for (int i = 0; i <= 10; i++) {
			if(i%3==0) continue;
			System.out.println(i);
		}
		
		
		
		
	}

}
