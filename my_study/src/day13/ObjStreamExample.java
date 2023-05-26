package day13;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjStreamExample {
    public static void main(String[] args) throws Exception {
        writeList();
        List<Item> list = readList();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Item item : list){
            System.out.println(item.getBno() + item.getContent() + sdf.format(item.getDate()));
        }
    }
    public static void writeList() throws Exception{
        List<Item> list = new ArrayList<Item>();
        list.add(new Item(1,"제목1","내용1","글쓴이1",new Date()));
        list.add(new Item(2,"제목2","내용2","글쓴이2",new Date()));
        list.add(new Item(3,"제목3","내용3","글쓴이3",new Date()));

        FileOutputStream fos = new FileOutputStream("F:/java/java_review/my_study/test5.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
    public static List<Item> readList() throws Exception{
        FileInputStream fis = new FileInputStream("F:/java/java_review/my_study/test6.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Item> list = (List<Item>) ois.readObject();
        return list;
    }
    // 시간이 있다면 file 클래스에서도 알아보자~~
}
