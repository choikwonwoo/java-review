package day6;

public class Tire {
    public int maxRotation;
    public int accumulatedRotation;
    public String location;

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation){
            return true;
        }else{
            return false;
        }
    }
}
