package ch3;


public class ifEx1 {

	public static void main(String[] args) {

//int num = 0;
////num값이 0이라면 num=0 출력하기
//
//if (num==0) {
//	System.out.println();
//}
//
//
////num값이 0이 아니라면 num!=0 출력하기
//if (num!=0) {
//	System.out.println("num!=0");
//}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력");
//		
//
//int score=Integer.parseInt(sc.nextLine());
//if (score>=60) {
//	System.out.println("합격");
//	
//}else {
//	System.out.println("불합격");
//}
		
int jumsu=58;
char grade=' ';
if (jumsu>=90) {
	grade='A';
}else if(jumsu>=80) {
	grade='B';
}else if(jumsu>=70) {
	grade='C';
}
	else if(jumsu>=60) {
		grade='D';
	}
	else if(jumsu>=50) {
		grade='E';
	}
System.out.printf("점수 : %d\n등급 : %c\n",jumsu,grade);
	
	

	}

}
