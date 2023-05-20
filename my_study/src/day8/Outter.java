package day8;

public class Outter {
	String field = "out";
	void method() {
		System.out.println("out");
	}
	
	class Nested{
		String field = "nested";
		void method () {
			System.out.println("in");
		}
		void print() {
			System.out.println( this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
