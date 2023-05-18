package day6;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i<=5; i++){
            int problemLocation = car.run();
            switch (problemLocation){
                case 1:
                    car.tire_1 = new Atire("1",30);
                    break;
                case 2:
                    car.tire_2 = new Btire("2",20);
                    break;
                case 3:
                    car.tire_3 = new Atire("3",20);
                    break;
                case 4:
                    car.tire_4 = new Btire("4",10);
                    break;
            }
        }
    }
}
