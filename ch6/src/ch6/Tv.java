package ch6;

public class Tv {
	//속성(property) ==> 멤버변수 
	//크기 , 길이 , 높이 , 색상 , 볼륨 , 채널...
	String color; //색상
	int channel;  //채널
	boolean power;//전원상태
	
	//기능(function) ==> 메서드 
	//전원 , 볼륨조절 , 채널변경...
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	
	
}
