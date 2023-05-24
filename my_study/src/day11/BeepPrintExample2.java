package day11;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Thread thread = new TaskExtends();
        thread.start();

        // 익명 객체 스레드
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i<10; i++){
                    System.out.println("삥");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
    }
}
