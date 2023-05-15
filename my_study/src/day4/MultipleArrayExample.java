package day4;

public class MultipleArrayExample {
    public static void main(String[] args) {
        // 다중 배열의 메모리는 스택에서 객체가 있는 힙영역을 참조하고
        // 힙영역에서는 배열이 배열의 힙 영역을 가지고 있다.
        // ex) String 배열의 메모리가 이렇게 생겼다.
        //simple code
        int [][] marr = new int [2][3];
        // 배열안의 배열의 크기가 서로 달라도 된다.
        int [][] marr1 = new int [2][];
        marr1[0] = new int[2];
        marr1[1] = new int[4];
        // 값으로 초기화
        int[][] marr2 = {{1,2,3},{3,4,5}};
        int[][] marr3;
        marr3 = new int[][] {{2,3},{3,4,5}};
    }
}
