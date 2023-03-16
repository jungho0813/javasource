package ch5;

import java.util.Arrays;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < 100; i++) {
			//0~9 사이의 임의의 값 구하기
			int n =(int)(Math.random()*9);
			int a = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = a ;
			
		}	
		
		System.out.println(Arrays.toString(numArr));
		
	}	

}