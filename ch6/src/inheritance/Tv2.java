package inheritance;

//this() : 생성자에서 내가 가지고 있는 다른 생성자를 호출시, 
//this.변수명 : 매개변수와 이름이 같을 때 구별하기 위해서

//super(): 생성자에서 부모 생성자를 호출 시, 
//super.변수명 : 부모가 가지고 있는 인스턴스 변수를 사용할 때

public class Tv2 {
	boolean power;
	int channel;
	
	
	
	public Tv2() {
		super();
	}
	void power() {
		power =! power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
