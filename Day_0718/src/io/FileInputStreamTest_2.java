package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest_2 {
	public static void main(String[] args) {
		File file = new File("song.txt");
		FileInputStream fis = null;
		//FileInputStream fis = new FileInputStream(file);
		// 배열로 읽기
		try {
			//file open
			fis = new FileInputStream(file);
			//processing
			byte[]data = new byte [50];// 50 , 50, 50, 24
			int count = 0; //  몇번 read 했는지 체크하는 변수
			 while (true) {
				 count=fis.read(data); //  몇개를 한꺼번에 읽었는지 확인
				 if(count==-1)break;	 

				 for(int i =0;i<count;++i)
					 System.out.println((char)data[i]);
			 }
			 System.out.println("끝!");
		}catch (Exception e) { // io - father
			System.out.println(e.getMessage());
		}finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
