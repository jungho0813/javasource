package ch5;

import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"interger","정수"},
		};
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d) %s 의 뜻은?\n",i+1, words[i][0]);
			
			System.out.print(">>");
			//답변 입력받기
			String answer = sc.nextLine();
			
			//정답과 답변 비교
			if(answer.equals(words[i][1])) {
				System.out.println("정답");
			}else {
				System.out.printf("오답 정답은 %s \n",words[i][1]);
			}
		}
		
		
		
		
		
	}	

}