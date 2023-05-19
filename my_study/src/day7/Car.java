package day7;

public class Car {
    Tire t1 = new Atire();
    Tire t2 = new Atire();
    Tire t3 = new Atire();
    Tire t4 = new Atire();

    Atire at1 = (Atire) t1; // 강제 형변환 가능.
    boolean typeCheck = at1 instanceof Tire;

    void run(){
        t1.roll();
        t2.roll();
        t3.roll();
        t4.roll();
    }

}
