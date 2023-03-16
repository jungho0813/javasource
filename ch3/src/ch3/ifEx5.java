package ch3;

import java.util.Scanner;

public class ifEx5 {
	public static void main(String[] args) {
		
		//중첩if 
//		if (condition) {
//			if (condition) {
//				
//			}else {
//				
//			}
//		}else {
//			
//		}

		
		//점수를 입력 받아서 점수가 90이상이면 A인데, 98이상이라면 A+, 94미만이면 A-
		//점수를 점수가 80이상이면 B인데, 98이상이라면 B+, 94미만이면 B-
		//점수가 80미만이라면 C
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = Integer.parseInt(sc.nextLine());
		char grade=' ', opt=' ';
		
		if (score>=90) {
			grade='A';
			if(score>=98) {
				opt='+';
			}else if(score<=94) {
				opt='-';
			}
		}else if(score>=80) {
			grade='B';
			if(score>=88) {
				opt='+';
			}else if(score<=84) {
				opt='-';
			}
		}else {
			grade='C';
		}
		
		System.out.printf("당신의 학점은 %c%c",grade,opt);
		
		
		
		
			
		
		
	}
}
