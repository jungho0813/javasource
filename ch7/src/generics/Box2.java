package generics;

/*
 * Box2<T> : 지네릭 클래스, T Box2
 * T : 타입변수, 타입 매개 변수
 * Box2 : 원시타입(raw type)
 */


public class Box2<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
