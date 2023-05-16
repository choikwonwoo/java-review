package day5;

public class Singleton {
    private static Singleton singleton = new Singleton(); // 인스턴스 생성
    private  Singleton(){} // 생성자 접근 제한
    static Singleton getInstance(){
        return  singleton;
    }
    // getInstance 를 통해서만 생성 가능 즉 단 하나의 객체만 만들어 지며 같은 인스턴스를 참조하게 된다. new 를 못쓰기 때문.
}
