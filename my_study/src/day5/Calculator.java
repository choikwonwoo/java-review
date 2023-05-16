package day5;

public class Calculator {
    void power(){
        System.out.println("power on");
    }
    int plus(int x, int y){
        return x+y;
    }
    double divide(double x,double y){
        return (double) x/y;
    }
    // 인자가 몇개나 들어올지 모를때.
    int sum (int[] arg){
        int result = 0;
        for(int i :arg){
             result += i;
        }
        return  result;
    }
    // 메소드 오버로딩
    int sum(int x, int y){
        return  x+y;
    }
}
