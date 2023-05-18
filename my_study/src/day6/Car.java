package day6;

public class Car {
    Tire tire_1 = new Tire("1",6);
    Tire tire_2 = new Tire("2",7);
    Tire tire_3 = new Tire("3",9);
    Tire tire_4 = new Tire("4",3);

    int run(){
        if (tire_1.roll() == false){
            stop();
            return 1;
        }
        if (tire_2.roll() == false){
            stop();
            return 1;
        }
        if (tire_3.roll() == false){
            stop();
            return 1;
        }
        if (tire_4.roll() == false){
            stop();
            return 1;
        }
        return 0;
    }
    void stop(){}
}
