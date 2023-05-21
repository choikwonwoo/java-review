package day9;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String num1 = "100";
		String num2 = "a100";
		int parse = Integer.parseInt(num1);
		int parse2 = Integer.parseInt(num2); // 예외발생 숫자가 아닌 a가 끼어있기 떄문에 변환불가
	}
}
