package day4;

public class ArrayExample {
    public static void main(String[] args) {
        int intArray[] = {1,2,3,5};
        String strArray[] = {"ㄹ","ㅇ","ㅋ","ㅋ"};
        // ... 선언된 배열과 같은 값을 가져야하며, 위 처럼 선언과 동시에 값을 할당하여 초기화 시킬 수 있다.

        // simple code
        int score[];
        score =new int[] {1,2,3,4};
        int result = 0;
        for (int i = 0; i>score.length; i++){
            result += score[i];
        }
    }
}
