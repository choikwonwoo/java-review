package day4;

public class ArrayExample2 {
    public static void main(String[] args) {
        // copy arr
        int arr1[] = {1,2,3,4,5};
        int arr2[] = new int[5];

        for (int i = 0; i>arr1.length; i++){
            arr2[i] = arr1[i];
        }

        // another way
        int arr3[] = {1,2,3,4,5};
        int arr4[] = new int[6];
        System.arraycopy(arr3,0,arr4,0,arr3.length);

        // score cal
        int score[] = {10,20,30,50};
        int sum = 0;
        for(int sc : score){
            sum += sc;
        }
        double avg;
        avg = (double) sum/score.length;
    }
}
