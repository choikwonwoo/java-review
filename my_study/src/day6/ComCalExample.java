package day6;

public class ComCalExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator =new Calculator();
        System.out.println(calculator.areaCircle(r)); // 오버라이딩 전 메소드

        Computer computer = new Computer();
        System.out.println(computer.areaCircle(r));

        Calculator cal = new Computer();
        cal.areaCircle(r);
        System.out.println(cal.areaCircle(r)); // 얘도 오버라이딩 됨.

        // 또한 final로 정의된 클래스, 메소드 는 상속이 불가하다.
    }
}
