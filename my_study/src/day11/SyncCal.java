package day11;

public class SyncCal {

    private int memory;
    public int getMemory(){
        return memory;
    };
    public synchronized void setMemory(int memory){
        // synchronized 를 사용하면 동기화된 메모리를 사용할 수 있다.
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };
}
