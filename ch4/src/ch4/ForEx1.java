
package ch4;

public class ForEx1 {
	public static void main(String[] args) {
		
		//반복문
		// 어떤 작업이 반복적으로 수행되도록 할 때 사용
		// 종류 : for(주로 사용), while, do-while
		
		// 실행순서
		// ⓐ int i = 0; : 초기화 
		// ⓑ i < 10;    : 조건식
		// ⓒ 조건식이 true 일때 블럭안으로 진입
		// ⓓ i++        : 증감식 i=1
		// ⓔ 다시 조건식을 검사
		 
		for (int i = 0; i <= 10; i++) {
			 System.out.print(i+"  ");
		}
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			 System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			 System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			
			 System.out.print(i+"  ");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println();		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();		
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();		
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum = sum+i;
		}
		System.out.println("1~10 합 "+sum);
		
		
		
	}

}
