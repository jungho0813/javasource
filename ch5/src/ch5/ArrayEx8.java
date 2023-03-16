package ch5;

public class ArrayEx8 {
	public static void main(String[] args) {
		// 2차원 배열
		
		//2차원배열 선언
		int [][] score=new int[4][3];
		int[] score2[]=new int[2][3];
		int score3[][]=new int[5][2];
		
		//[행번호][열번호]
		System.out.println(score2[0][0]);
		System.out.println(score2[1][2]);
		
		//2차원 길이 " 행 길이
		System.out.println("행 길이 "+score2.length);
		//열 길이
		System.out.println("열 길이 "+score2[0].length);
		
		for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {
				System.out.printf("%d ",score2[i][j]);
			}
			System.out.println();
		}
		
		int[] score4[]= {
				{10,11,12},
				{20,21,22}
		};
		
		for(int arr[]:score4) {
			for(int j:arr) {
				System.out.printf("%d " ,j);
			}
			System.out.println();
		}
		
		
	}	

}