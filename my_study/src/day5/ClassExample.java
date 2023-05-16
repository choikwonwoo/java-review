package day5;

public class ClassExample {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(); // 서로 독립된 객체

        Car k5_kia = new Car();
        System.out.println(k5_kia.company);
        System.out.println(k5_kia.color);
        System.out.println(k5_kia.speed);
        // 클래스에서 선언만 했을 뿐인데 0 값 출력
        // char, String, arr 는 각각 '', null, null 값을 기본값으로 하고 나머지는 0.0 이나 0을 기본값으로 한다.

        k5_kia.speed = 130;

        Person ps = new Person("name","man",178);
        int stv = Student.NUM; // 정적 멤버 사용
    }
}
