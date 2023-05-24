package day11;

import day6.Calculator;

public class ThreadExample {
    public static void main(String[] args) {
        SyncCal cal = new SyncCal();

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setCal(cal);
        t2.setCal(cal);

        t1.start();
        t2.start();

        // t1.interrupt(); t1의 스레드를 종료 시키는 메소드 단, t1이 대기상태 일 때만 가능하다. ex) t1에서 Thread.sleep(); 을 사용했을 경우
        // t1 안에서 반복문 조건에 if(Thread.interrupt()){break;}를 사용해준다.  이것은 인터럽트가 발생 했을 경우 트루 리턴.
        // setDemon(true); 해당 스레드를 데몬 스레드로 만든다.
    }
}
