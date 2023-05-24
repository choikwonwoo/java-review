package day11;

public class BeepPrintExample {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);

        thread.start();

        for (int i = 0; i<10; i++){
            System.out.println("삥");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 익명 객체 사용방법
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("삥");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // getName(); 스레드의 이름을 불러옴
        // setName(); 스레드의 이름을 설정함
        // currentThread(); 현재 실행 스레드 참조
    }
}
