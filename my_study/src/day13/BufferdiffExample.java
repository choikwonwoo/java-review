package day13;

import java.io.*;

public class BufferdiffExample {
    public static void main(String[] args) throws Exception{
        String aPath1 = BufferdiffExample.class.getResource("test.txt").getPath();
        String aPath2 = "F:/java/java_review/my_study/atest.txt";
        FileInputStream fis1 = new FileInputStream(aPath1);
        FileOutputStream fos1 = new FileOutputStream(aPath2);

        String bPath1 = BufferdiffExample.class.getResource("test1.txt").getPath();
        String bPath2 = "F:/java/java_review/my_study/btest.txt";
        FileInputStream fis2 = new FileInputStream(bPath1);
        FileOutputStream fos2 = new FileOutputStream(bPath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long t1 = copy(fis1,fos1);
        long t2 = copy(bis,bos);

        fis1.close();
        fos1.close();
        bis.close();
        bos.close();
    }
    static int data = -1;
    public static long copy(InputStream is ,OutputStream os)throws Exception{
        long start = System.nanoTime();
        while (true){
            data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return end -start;
    }
}
