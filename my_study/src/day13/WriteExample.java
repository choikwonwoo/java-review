package day13;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("F:/java/java_review/my_study/src/test2.txt");

        char a = 'A';
        char b = 'B';
        char c = 'C';
        char[] d = {'a','b','c'};
        String abc = "abc";

        writer.write(a);
        writer.write(b);
        writer.write(c);
        writer.write(d); // 문자열 저장.
        writer.write(d,1,2); // 문자열의 일부 저장.
        writer.write(abc); // String 문자열 저장

        writer.flush();
        writer.close();
    }
}
