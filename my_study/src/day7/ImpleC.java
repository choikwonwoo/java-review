package day7;

public class ImpleC implements InterfaceC{
    @Override
    public void methodC() {
        System.out.println("c");
    }
    @Override
    public void methodB() {
        System.out.println("B");
    }
    @Override
    public void methodA() {
        System.out.println("A");
    }
}
