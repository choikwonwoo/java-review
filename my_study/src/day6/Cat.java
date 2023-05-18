package day6;

public class Cat extends Animal{
    Cat(){
        this.kind = "cat";
    }
    @Override
    public void sound() {
        System.out.println("야용");
    }
}
