package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {
	public static void main(String[] args) {
		// ArrayList 에 Member1 객체를 추가
		ArrayList<Member1> list = new ArrayList<>();
		list.add(new Member1("홍"));
		list.add(new Member1("김"));
		list.add(new Member1("이"));
		list.add(new Member1("박"));
		
		System.out.println(list);
		
		ArrayList<Member2> list2 = new ArrayList<>();
		list2.add(new Member2("홍","hong","123"));
		list2.add(new Member2("김","kim","123"));
		list2.add(new Member2("이","lee","123"));
		list2.add(new Member2("박","park","123"));
		
		System.out.println(list2);
		
		for (int i = 0; i < list.size(); i++) {
			Member2 member = list2.get(i);
			System.out.println("id : "+member.getId()+", password : "+member.getPassword()+", name : "+member.getName());
		}
		
		// Iterator : List,Set,Map 구조에서 요소를 접근하는 방법에 대한 통일성 제공
		// hasNext() : 다음요소가 존재하는 경우 true
		// next() : 요소 가져오기
		System.out.println();
		System.out.println("id     password      name");
		System.out.println("==============================");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t      "+member2.getName());
			
		}
		
		System.out.println();
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t      "+member2.getName());
		}
		
	}
}






































