package day12;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍",30));
		set.add(new Member("홍",30));
		// 다른 인스턴스지만 한개만 저장됨.
	}

}
