package day8;

public class A {
	// 생성자
	A(){};
	// 일반 내부 클래슨느 정적 필드 메소드 사용 불가.
	// 단 외부일 경우 모든 종류의 필드와 메소드 접근 가능
	class B {
		// B 내부 클래스 생성자
		B(){};
		int field1;
		// static int field2;
		void method1() {}
		// static void method2(){}
	}
	// 정적 클래스는 내부에 모든 종류의 필드와 메소드 사용가능
	// 단 외부일 경우 static 필드나 메소드만 접근 가능
	static class C{
		C(){};
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		int a =100;
		class D{
			D(){}
			int field1;
			void method1() {
				// a=200; // 로컬에서 정의된 클래스에서 메소드의 로컬변수를 변경할 수 없다.
			}
		}
		D d = new D();
		d.field1 =3;
		d.method1();
		
	}
	
	
	// 사용 제한 
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// static B field3 = new B();// B가 static이 아니기 때문에 오류 발생
	static C field4 = new C();
	
	static void method2() {
		// B var1 = new B(); // 마찬가지로 static이 아님
		C var2 = new C();
	}
	
}
