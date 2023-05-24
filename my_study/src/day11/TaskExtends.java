package day11;

public class TaskExtends extends Thread{
    @Override
    public void run() {
        for (int i =0; i<100; i++){
            System.out.println("슬헤득사 돌낟");
        }
    }
}
