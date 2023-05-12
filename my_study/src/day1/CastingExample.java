package day1;

public class CastingExample {
    public static void main(String[] args) {
        // int casting to char
        int ivar = 44032;
        char cvar = (char)ivar;

        // long casting to int
        long lvar = 500;
        int ivar1 = (int)lvar;

        // double casting to int
        double dvar = 500.00;
        int ivar2 = (int)dvar;

    // 연산시 int 보다 작은 친구들은 자동 형변환되어 사용된다. 또한 그보다 더 큰 친구가 피연산자일 경우
    // 더 큰 친구의 자료형이 결과물의 자료형이 되어야 한다.
    // * 연산에서의 promotion을 주의 하자.
        int x = 1;
        int y = 2;
        double result = (double) x/y;

    }
}
