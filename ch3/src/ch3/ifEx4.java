package ch3;

import java.util.Scanner;

public class ifEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간을 입력해주세요");
//		int hours = Integer.parseInt(sc.nextLine());
//		//근무 시간 입력받기
//		//8시간 근무시 시간당 9800원 일때 
//		//초과근무 시 1.5배를 지급
//		//12 시간 근무시 하루일당
//		int rate=9800; //시급
//		int pay=0;     //하루일당
//		if(hours>8) {
//			pay = (int)((hours-8)*1.5*rate+rate*8);
//		}else { //hours가 8이하일때
//			pay = hours * rate;
//					}
//		System.out.println("하루 일당 : "+pay);
//		
		
		
		// 키, 몸무게 입력받기
//		System.out.print("키 입력 : ");
//		int height = Integer.parseInt(sc.nextLine());	
//		System.out.print("몸무게 입력 : ");
//	    double weight = Double.parseDouble(sc.nextLine());	
//	    // 저체중 , 표준 , 과체중 출력하는 프로그램 작성
//	    
//	    double result = (height-100)*0.9;
//	    
//	    // (키-100)*0.9 < 몸무게 : 과체중
//	    if(result < weight) {
//			 System.out.println("과체중");
//		// (키-100)*0.9 == 몸무게 : 표준 	 
//		}else if(result == weight) {
//			System.out.println("표준체중");
//		// (키-100)*0.9 > 몸무게 : 저체중  
//		}else {
//			System.out.println("저체중");
//		}
	    
	    //윤년 , 평년 구하기
//	    int year=2023;
//	    //윤년 : 연도를 4로 나눈 나머지가 0 이고 
//	    //연도를 100으로 나눈 나머지가 0이 아니거나
//	    //연도를 400으로 나눈 나머지가 0이면
//        
//	    if (year%4==0 && year%100!=0 || year%400 == 0) {
//			  System.out.println("윤년");
//		}else {
//			  System.out.println("평년");
//		}
//	    
		
		// 임의의 숫자3개 입력받기
		// 입력받은 3개의 숫자 중 가장 작은 수를 출력
		
		System.out.print("첫번째 수 입력 : ");
		int n1=Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수 입력 : ");
		int n2=Integer.parseInt(sc.nextLine());
		System.out.print("세번째 수 입력 : ");
		int n3=Integer.parseInt(sc.nextLine());
		
		// n1 < n2 && n1 < n3
		int min=n1;
		int max=n1;
		if(max<n2) {
			max=n2;
		}if(max<n3) {
			max=n3;
		}
		System.out.println("가장 큰수 "+max);
		  if(n1>n2) {
				n1=n2;
			  }if(n1>n3) {
				n1=n3;
			 }
		System.out.println("가장 작은 수 "+n1);
	}
}
