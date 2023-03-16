package ch5;

public class ArrayEx1 {

	public static void main(String[] args) {
		//배열 (array)
		//같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
		//int score1=98, score2=88, ....;
		//==> int score[];  // 배열 선언
		//==> socre = new int[30];  // 배열 생성
			
		//연속된 공간에 int 값을 저장할 수 있는 30개의 공간을 생성
		//index 를 이용해서 접근을 할 수 있음
		//int 타입은 0으로 초기화 됨
		int score[]=new int[30];
		//새로운 값을 할당
		score[0]=98;
		score[0]=68;
			
		System.out.println(score[2]); //0~29 index로 접근
		System.out.println(score[1]); 

		//배열 선언,생성,초기화
		//10명에 대한 점수를 배열로 다루기
		int score2[]= {98,88,68,50,62,42,56,74,23,48};
		
		System.out.println(score2[5]);
		
		double score3[]= {98.3,88.2,68.1,50.5,62.6,42.3,56.2,74,23,48};
		
		
		
		System.out.println("score3 길이 : "+score3.length);
		for (int i = 0; i < score3.length; i++) {
			System.out.println((i+1)+"번째 학생 점수 "+score3[i]);
			
		}
		
		//char 5개를 담는 배열
		char chArr[]= {'a','b','c','d','e',};
		//배열의 수를 보는법
		System.out.println(chArr.length);
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
