package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("friend.dat"));
			FriendVO f = (FriendVO)ois.readObject(); // Downcasting
			f.output();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois !=null)ois.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}

	}

}
