package day9;

public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		int[] data1 = new int[] {1,2,3};
		String[] data2 = new String[] {"",""};
		
		System.out.println(data1[4]);
		System.out.println(data2[4]);// 배열의 범위를 벗어나 예외 발생
	}
}
