package day3;

public class IfExmaple {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 95) {
            System.out.println(score + "점 입니다.");
        }else{
            System.out.println(score + "점 입니다.");
        }
        // 예제를 활용한 다이스
        int num = (int)(Math.random()*6)+1;
        if(num == 1){
            System.out.println("주사위의 눈 : " + num);
        }else if (num == 2){
            System.out.println("주사위의 눈 : " + num);
        }else if (num == 3){
            System.out.println("주사위의 눈 : " + num);
        }else if (num == 4){
            System.out.println("주사위의 눈 : " + num);
        }else if (num == 5){
            System.out.println("주사위의 눈 : " + num);
        }else{
            System.out.println("주사위의 눈 : " + num);
        }
    }
}
