
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			char[]buffer = new char[1000];
			int count =0;
			
			fr = new FileReader("supernova.txt");
			fw = new FileWriter("supernova_copy.txt");
			while(true) {
				count = fr.read(buffer);

				if(count==-1)break;
				
				if(count==buffer.length) {
					fw.write(buffer);
					for(int i =0;i<count;++i) {
						System.out.println((char)buffer[i]);
					}
				}
				else if (count<buffer.length) {
					for (int i = 0;i<count;++i) {
						fw.write((char)buffer[i]);
					}
				}
			}
			System.out.println("복사완료");
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			}catch(Exception e) {
			e.printStackTrace();
			}
		
	}

}
}