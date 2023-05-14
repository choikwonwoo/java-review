package day3;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6)+1;

        switch (num){
            case 1:
                System.out.println("주사위의 눈 : 1");
                break;
            case 2:
                System.out.println("주사위의 눈 : 2" + num);
                break;
            case 3:
                System.out.println("주사위의 눈 : 3" + num);
                break;
            case 4:
                System.out.println("주사위의 눈 : 4" + num);
                break;
            case 5:
                System.out.println("주사위의 눈 : 5" + num);
                break;
            default:
                System.out.println("주사위의 눈 : 6" + num);
                break;
        }
        // 당연히 char String 도 가능하다. 항상  탈출문자를 주의하자
    }
}
