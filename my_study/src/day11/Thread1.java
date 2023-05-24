package day11;

public class Thread1 extends Thread{
    private  SyncCal cal;
    @Override
    public void run() {
        cal.setMemory(100);
    }
    public  void setCal(SyncCal cal){
        this.cal = cal;
    }
}
