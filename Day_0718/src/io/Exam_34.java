package io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam_34 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        byte[] buffer = new byte[100];
        int count = 0;        

        try {
            bis = new BufferedInputStream(new FileInputStream("cat.jpg"));
            bos = new BufferedOutputStream(new FileOutputStream("cat_copy.jpg"));

            while (true) {
                count = bis.read(buffer);
                if (count == -1) break;

                if (count < buffer.length) {
                    bos.write(buffer, 0, count);
                    break;    
                }
                bos.write(buffer, 0, count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) bos.close();
                if (bis != null) bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
