package day9;

public class ThrowsExample{
	public static void main(String[] args) {
		try {
			mathod1();
		}catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했다.");
		}
	}

	private static void mathod1() throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class clazz = Class.forName("java.lang.String2");
	}
}
