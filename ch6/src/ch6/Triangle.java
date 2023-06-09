package ch6;

public class Triangle {
	//삼각형 너비 구하기
	
	//속성
	//밑변,높이 ==> 정수
	int baseLine;
	int height;
	
	public Triangle(int baseLine, int height) {
		super();
		this.baseLine = baseLine;
		this.height = height;
	}

	//기능
	//넓이 구하기
	//밑변*높이/2
	double getArea(){
		return baseLine * height /2.0;
	}
}
