package day10;

public class EqualExample {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();

        String a = "아니";
        String b = new String("아니");

        System.out.println(a == b); // false  = 객체를 비교
        System.out.println(a.equals(b));// true = 값을 비교
    }
}
