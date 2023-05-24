package day11;

public class Thread2 extends Thread{
    private  SyncCal cal;
    @Override
    public void run() {
        cal.setMemory(50);
    }
    public  void setCal(SyncCal cal){
        this.cal = cal;
    }
}
