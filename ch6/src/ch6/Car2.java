package ch6;

public class Car2 {
	//속성(property) : 멤버변수
	//제조사 , 모델 , 색상 , 최대속도.....
	String company;
	String model;
	String color;
	int maxSpeed;
	
	//생성자(Constructor)
	//우클릭 [source] - [Generate Constructor using fields...]
	//생성자의 이름은 클래스 이름과 동일해야함
	//리턴값이 없음
	//생성자는 여러개 존재가능 ( 생성자 오버로딩 )
	// 목적: 인스턴스가 생성될 때 호출됨
	//      인스턴스 초기화 담당
	
	public Car2() { //기본(default)생성자
		super();
	}
		
	public Car2(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

	//기능(function): 메소드
	//전진 , 후진
	void forward() {
		System.out.println("전진");
	}
	void backward() {
		System.out.println("후진");
	}
	
	
	
}
