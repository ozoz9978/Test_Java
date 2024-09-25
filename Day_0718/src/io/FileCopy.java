package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			byte[]buffer = new byte [1000];
			int count =0;
			
			fis = new FileInputStream("hello.txt");
			fos = new FileOutputStream("hello_copy.txt");
			while(true) {
				count = fis.read(buffer);
				if(count==-1)break;
				
				if(count<buffer.length) {
				fos.write(buffer);//잘못하면 찌꺼기가 섞일 수 있다.
				System.out.println();
					for(int i =0;i<count;++i) {
						System.out.println((char)buffer[i]);
					}
				}
				else if (count<buffer.length) {
					for (int i = 0;i<count;++i) {
						fos.write((char)buffer[i]);
					}
				}
			}
			System.out.println("복사완료");
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(fis != null) fis.close();
				if(fis != null) fos.close();
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
}