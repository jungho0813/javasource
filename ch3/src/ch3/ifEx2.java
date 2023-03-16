package ch3;


public class ifEx2 {
	public static void main(String[] args) {

int jumsu=48;
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
	}else {
		grade='F';
	}
System.out.printf("점수 : %d\n등급 : %c\n",jumsu,grade);
		
	}
}
