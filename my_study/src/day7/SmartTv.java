package day7;

public class SmartTv implements RemoteControl,Searchable{
    private  int value;
    @Override
    public void turnOn() {
        System.out.println("켬");
    }
    @Override
    public void turnOff() {
        System.out.println("끔");
    }
    @Override
    public void setValue(int value) {
        if (value<MIN_VALUE){
            this.value = MIN_VALUE;
        }else if (value>MAX_VALUE){
            this.value = MAX_VALUE;
        }else{
            this.value = value;
        }
    }
    @Override
    public void search(String url) {
        System.out.println("검색");
    }
}
