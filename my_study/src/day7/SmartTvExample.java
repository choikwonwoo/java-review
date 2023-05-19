package day7;

public class SmartTvExample {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        // 인터페이스로의 역할
        RemoteControl rc = tv;
        Searchable sc = tv;
    }
}
