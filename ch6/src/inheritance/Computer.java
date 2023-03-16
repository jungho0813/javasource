package inheritance;

// Math.random() : static 메소드
// Math.PI : final static double PI = 3.14159~~~

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
}
