package day7;

public class ImpleCExample {
    public static void main(String[] args) {
        ImpleC impleC = new ImpleC();

        InterfaceA ia = impleC;
        InterfaceB ib = impleC;
        InterfaceC ic = impleC;

        ia.methodA();

        ib.methodB();
        ib.methodA();

        ic.methodC();
        ic.methodB();
        ic.methodA();
    }


}
