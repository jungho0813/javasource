package generics;

import java.util.ArrayList;

/*
 * Box2<T> : 지네릭 클래스, T Box2
 * T : 타입변수, 타입 매개 변수
 * Box2 : 원시타입(raw type)
 */


public class Box3<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T getT(int i) {
		return list.get(i);
	}
	int sicze() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	
	
}
