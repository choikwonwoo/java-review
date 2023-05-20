package day8;

public class Anonymous {
	Person person = new Person() {
		// 외부에서 접근이 불가하다. 즉 일회용 클래스를 만들고 여기에서만 적용될 메소드를 잠깐 사용하는 것이다.
		void method2() {
			System.out.println("사람아이녖?");
		}
		@Override
		void method1() {
			System.out.println("오버라이드죠?");
			method2();// 여기에서만 사용 가능하다!
		}
	};
	void method3() {
		Person localP = new Person() {
			void method2() {
				System.out.println("사람아이녖?");
			}
			@Override
			void method1() {
				System.out.println("오버라이드죠?");
			}
		};
		localP.method1();
	}
	
	public interface Remote{
		public void on();
		public void off();
	}
	// 인터페이스인 경우
	Remote remote = new Remote() {
		
		@Override
		public void on() {
			System.out.println("익ㅁ영이죠?");
		}
		
		@Override
		public void off() {
			System.out.println("익ㅁ영이죠?");
		}
	};
	void methodA() {
		Remote remote1 = new Remote() {
			
			@Override
			public void on() {
				System.out.println("익ㅁ영이죠?");
			}
			
			@Override
			public void off() {
				System.out.println("익ㅁ영이죠?");
			}
		};
		remote.on();
		remote.off();
	}
	
	// * 익명객체 사용할 떄도 메소드 내 중첩 클래스에서 필드를 변경할수 없는 것 처럼 마찬가지로 변경이 불가능하다 static 때문에.
}
