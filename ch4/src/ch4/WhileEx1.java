package ch4;

public class WhileEx1 {
	public static void main(String[] args) {
		
		//반복문
		// 어떤 작업이 반복적으로 수행되도록 할 때 사용
		// 종류 : for(주로 사용), while, do-while
		
		int i=0;
		while (i < 10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=10;
		while (i >= 1) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		i=1;
		while (i <= 10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=10;
		while (i >= 1) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		i=0;
		while (i < 3) {
			System.out.println("Hello");
			i++;
		}
		i=1;
		while (i <= 10) {
			 System.out.print(i+" ");
			 i+=2;
		}
		System.out.println();
		int sum=0;
		i=1;
		while (i <= 10) {						
			sum=sum+i;
			i++;
		}System.out.print("합"+sum);
		
	}

}
