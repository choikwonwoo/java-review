package day3;

public class ForExample {
    public static void main(String[] args) {
        // for
        int result = 0;
        for(int i = 1; i<11; i++){
            result = result + i;
        }
        // multi for
        for (int i = 2; i<10; i++){
            for (int j = 1; j<10; j++){
                System.out.println(i + " * " + j +" = " + i*j);
            }
        }
        // while
        while (result>=0){
            result--;
        }

        // do while
        do {
            result--;
        }while (result>=0);

        // break 사용시 주의점 가까운 반복만 탈출 원하는 탈출구가 있다면 라벨을 사용하도록
        // continue 사용시 주의점 탈출이 아닌 다음 순서?로 넘어간다.
    }
}
