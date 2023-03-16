package ch6;

public class PersonEx {

	public static void main(String[] args) {
		//Person 인스턴스가 생성됨 ==> Person이 가지고 있는 인스턴스변수를 사용할수 있음
		Person p = new Person();
		p.setName("");
		p.print();
		
		Person.print2();

	}

}
