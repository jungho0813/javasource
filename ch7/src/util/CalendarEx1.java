package util;

/* 날짜와 시간
 * 1. jave.util.Calendar 클래스
 * 2. jave.util.Date 클래스
 * 3. jave.time.LocalDate, LocalTime, LocalDateTime 클래스 ==> 8 버전에서 추가
 */

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		// Calendar c = new Calendar(); 추상 클래스이기 때문에 new 못함		
		// 추상 클래스,interface 는 new 를 못하기 때문에 자식클래스를 만들어서 사용
		
		// 현재 시스템의 날짜와 시간 정보 리턴
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.toString());
		
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월) : "+today.get(Calendar.MONTH));
		System.out.println("올 해의 몇째주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일 : "+today.get(Calendar.DAY_OF_MONTH));
		
		
	}
}













