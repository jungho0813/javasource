package ch6;

public class PysicalInfo {
	//생성자 & 메소드 오버로딩
	//오버로딩 : 한 클래스에 동일한 이름의 메소드 혹은 생성자가 존재
	
	String name;
	int age;
	float height;
	float weight;
	//생성자 오버로딩
	public PysicalInfo(String name, int age, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public PysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public PysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
