package day6;

public class Atire extends Tire{
    public Atire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println("a오버라이드");
            return true;
        }else{
            System.out.println("a오버라이드");
            return false;
        }
    }
}
