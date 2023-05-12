package day1;

public class VariableExample {
    public static void main(String[] args){
        int x = 10;
        int y = 15;

        System.out.println(x +"," +  y );
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x +"," +  y +","+ temp);
    }
}
