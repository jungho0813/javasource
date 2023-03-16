package inheritance;
/*  상속
 *  기존의 클래스를 재사용하여 새로운 클래스를 작성
 *  상속 장점
 *  1) 적은 양의 코드로 새로운 클래스를 작성할수있음
 *  2) 코드를 공통적으로 관리하기 때문에 추가및 변경이 용이함
 *  
 *  extends : 상속 표현
 */
public class Parent {
	int age;



}

class Child extends Parent{
	void play() {
		System.out.println("play!!!");
	}
}
