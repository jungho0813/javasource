package register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {
	
	private Scanner name;

	public Member getNewMember(Scanner sc) {
		// 새로운 Member 정보 입력받기
		System.out.print("ID정보 입력 : ");
		String id = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("주소 입력 : ");
		String address = sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		System.out.print("나이 입력 :");
		int age = Integer.parseInt(sc.nextLine());
		
		return new Member(id, name, address, email, age);

	}
	
	public void printAddSuccessMessage(Member member) {
		// 홍길동님 회원 정보 추가 성공
		System.out.println(member.getName()+" 님 회원 정보 추가 성공");
	}
	
	public void printMemberList(ArrayList<Member> list) {
		System.out.println("아이디  이름   주소   이메일   나이");
		for (Member member : list) {
			System.out.printf("%3s",member.getId());
			System.out.printf("%6s",member.getName());
			System.out.printf("%8s",member.getAddress());
			System.out.printf("%10s",member.getEmail());
			System.out.printf("%5d",member.getAge());
			System.out.println();
		}
	}
	
	public Member updateMember(Scanner sc, ArrayList<Member> list) {
		// 수정할 회원의 아이디를 입력받기
		System.out.print("id입력 : ");
		String id = sc.nextLine();
		// list에서 입력된 회원의 아이디와 일치하는 회원찾기
		Iterator<Member>it = list.iterator();
		while (it.hasNext()) {
			Member member = (Member) it.next();
			
			if(member.getId().equals(id)) {
				// 회원이 존재한다면 변경할 정보를 입력받기
				System.out.println("변경한 정보 입력 : ");
				String address = sc.nextLine();
				// 정보변경
				member.setAddress(address);
				
				// 수정된 회원을 리턴
				return member;
			}
		}
		return null;
	}
	
	

}































