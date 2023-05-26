package day13;

import java.io.FileInputStream;
import java.io.InputStream;

public class InPutStreamWriteExample {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("F:/java/java_review/my_study/src/test1.db");
        while(true){
            int data = is.read();
            if(data == -1){break;}
            System.out.println(data);
        }
        // 배열 사용
        byte[] array = new byte[100];
        while(true){
            int data = is.read(array); // 배열의 길이 만큼 읽기
            if(data == -1){break;}
            for (int i = 0; i<data; i++){
                System.out.println(array[i]); // 배열에 담긴 정보 출력
            }
        }
        // 배열 지정한 길이만큼 사용
        byte[] array1 = new byte[5];
        int data =  is.read(array1,2,3); // 2부터 3개를 읽고 array1에 뒤에서부터 저장
        for (int i = 0; i<data; i++){
            System.out.println(array1[i]); // 배열에 담긴 정보 출력
        }
        is.close();
    }
}
