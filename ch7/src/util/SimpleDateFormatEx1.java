package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		//시스템 날짜와 시간 객체
		Date date = new Date();
		System.out.println(date);
		// 날짜와 시간을 특정 형식에 맞춰 출력 가능하게 하는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(date));

	}

}
