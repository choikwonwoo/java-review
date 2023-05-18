package day6;

public class Dog extends Animal{
    public Dog(){
        this.kind = "dog";
    }
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
