package day13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("F:/java/java_review/my_study/src/test2.txt");

        while (true){
            int data = reader.read();// 한문자씩 읽기
            if (data == -1) break;
            System.out.println((char)data);
        }

        // 배열의 길이 만큼 읽기
        char[] carr = new char[100];
        while (true){
            int data = reader.read(carr);// 한문자씩 읽기
            if (data == -1) break;
            for (int i = 0; i<data; i++){
                System.out.println(carr[i]);
            }
        }

        // 지정한 길이 만큼 읽기
        char[] carr1 = new char[5];
        while (true){
            int data = reader.read(carr1,2,3);// 입력으로부터 3개의 문자를 읽고 2 3 4에 저장
            if (data == -1) break;
            for (int i = 0; i<data; i++){
                System.out.println(carr1[i]);
            }
        }
        reader.close();
    }
}
