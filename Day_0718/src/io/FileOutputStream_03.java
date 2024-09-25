package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_03 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("target.txt");
			for(int i ='a';i<='z';++i)
				fos.write(i);
			System.out.println("기록 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos !=null)fos.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}

	}

}
