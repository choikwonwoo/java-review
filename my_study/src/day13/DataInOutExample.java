package day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("F:/java/java_review/my_study/src/test2.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("오호");
        dos.writeDouble(0.125);
        dos.writeInt(1);
        dos.writeUTF("오호1");
        dos.writeDouble(0.225);
        dos.writeInt(3);
        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("F:/java/java_review/my_study/src/test2.db");
        DataInputStream dis = new DataInputStream(fis);
        for (int i = 0; i<2; i++){
            String str = dis.readUTF();
            Double du = dis.readDouble();
            int in = dis.readInt();
        }
        // 자료의 갯수가2개 라 2번 반복한 고ㅓ임
    }
}
