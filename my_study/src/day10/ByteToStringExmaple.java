package day10;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ByteToStringExmaple {
    public static void main(String[] args) throws IOException,UnsupportedEncodingException {
        byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
        byte[] bytes1 = new byte[100];
        String str1 = new String(bytes); // hello java
        String str2 = new String(bytes,6,4); // java

        int readByteNo = System.in.read(bytes1);
        String str3 = new String(bytes1,0,readByteNo-2);
//        try{
            bytes1 = str3.getBytes(StandardCharsets.UTF_8); // String을 바이트  배열로
//        }catch (UnsupportedEncodingException e){
            // 예외도 고려해야 한다.
//        }

    }
}
