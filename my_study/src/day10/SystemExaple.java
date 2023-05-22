package day10;

public class SystemExaple {
    public static void main(String[] args) {
        //exit
        for(int i = 0; i<100; i++){
            if(i == 15){
                System.exit(0);//시스템 종료
            }
        }
        // 걸린시간 구하기
        long time1 = System.nanoTime();
        int sum = 0;
        for(int i = 0; i<100; i++){
            sum += i;
        }
        long time2 = System.nanoTime();
        long time3 = time2 - time1; // 소요된 시간

    }
}
