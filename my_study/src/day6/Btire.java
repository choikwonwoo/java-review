package day6;

public class Btire extends Tire{
    public Btire(String location, int maxRotation) {
        super(location, maxRotation);
    }
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            System.out.println("b오버라이드");
            return true;
        }else{
            System.out.println("b오버라이드");
            return false;
        }
    }
}
