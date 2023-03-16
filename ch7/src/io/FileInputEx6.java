package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:\\temp\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("C:\\temp\\iu_copy.mp4")){

			int data = 0;
			
			long start = System.currentTimeMillis();
			
			while((data=fis.read())!=-1) {
				
			}
			long end = System.currentTimeMillis();
			System.out.println("걸린시간 "+(end-start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
