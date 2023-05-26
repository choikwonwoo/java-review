package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamWriteExample {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("F:/java/java_review/my_study/src/test1.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;
        byte[] d = {10,50,60};

        os.write(a);
        os.write(b);
        os.write(c);
        os.write(d); // 배열
        os.write(d,1,1);// 배열의 1번째 부터 1개 출력

        os.flush();
        os.close();
    }
}
