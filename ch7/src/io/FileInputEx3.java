package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class FileInputEx3 {
	public static void main(String[] args) {
		// FileInputEx1.java 를 읽어서 화면출력
		// 행번호와 같이 출력(FileReader, Writer)
		
//		try (FileReader fis = new FileReader(".\\src\\io\\FileInputEx1.java");
//				PrintStream out = System.out;){
//
//			int data = 0;
//			int row = 1; //행번호 변수
//			
//			out.print(row+"  ");
//			
//			while((data = fis.read())!=-1) {
//				
//				out.print((char)data);
//				
//				if(data == '\n') {
//					row++;
//					out.print(row+"  ");
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 		
		
		//FileReader / BufferedReader 사용하는 형태로 변경
		try (FileReader fis = new FileReader(".\\src\\io\\FileInputEx1.java");
				BufferedReader br = new BufferedReader(fis);){

			String str = null;
			int row = 0; //행번호 변수
			
//			System.out.println(row+" ");
			
			while((str = br.readLine())!= null) {
				row++;
				System.out.println(row +" "+str);
				
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
