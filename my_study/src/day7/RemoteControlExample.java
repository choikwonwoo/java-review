package day7;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스가 아닌 그냥 구현부 클래스 객체 생성이다.
        Tv tv = new Tv();
        Audio ad = new Audio();

        // 인터페이스로서의 역할을 한다.
        RemoteControl rc = null;
        rc = new Tv();
        rc = new Audio();
    }
}
