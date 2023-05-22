package day10;

public class ToString {
    String t1;
    String t2;

    ToString(String t1, String t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    @Override
    public String toString() {
        return t1 + "," + t2;
    }
}
