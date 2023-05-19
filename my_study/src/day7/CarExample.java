package day7;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        // 인터페이스의 장점 : 필드의 다형성
        car.t1 = new Btire();
        car.t2 = new Btire();
        car.run();
        // 마찬가지로 매개변수에 인터페이스 자료형이 들어가는 경우도 다형성 성립.
    }
}
