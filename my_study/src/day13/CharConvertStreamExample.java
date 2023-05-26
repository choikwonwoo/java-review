package day13;

import java.io.*;

public class CharConvertStreamExample {
    public static void main(String[] args) throws Exception{

    }
    public static void write(String str)throws Exception{
        FileOutputStream fos = new FileOutputStream("F:/java/java_review/my_study/src/test3.txt");
        Writer writer = new OutputStreamWriter(fos); // 보조 스트림 연결
        writer.write(str);
        writer.flush();
        writer.close();
    }
    public static String read()throws Exception{
        FileInputStream fis = new FileInputStream("F:/java/java_review/my_study/src/test3.txt");
        Reader reader = new InputStreamReader(fis); // 보조 스트림 연결
        char[] buffer = new char[100];
        int readChar = reader.read(buffer);
        reader.close();
        String data = new String(buffer,0,readChar); // 버퍼 수만큼 읽음
        return data;
    }
}
