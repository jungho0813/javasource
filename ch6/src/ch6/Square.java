package ch6;

public class Square {
	//정사각형 넓이
	
	//속성
	int sideLength;
		
	
	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}



	//넓이
	int getArea() {
		return sideLength * sideLength;
	}

}
