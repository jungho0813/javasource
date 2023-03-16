package ch5;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int score[] = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10;
		}
		
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		
		int iArr2[] = new int[10];
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		} 
		
		System.out.println(Arrays.toString(iArr2));
				
		char chArr[]= {'a','b','c','d','e',};
		System.out.println(chArr);
		
		String strArr[]= {"abc","efg"};
		System.out.println(strArr);
		
		
		
		
		
		
	}

}
