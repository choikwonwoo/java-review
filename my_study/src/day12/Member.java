package day12;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.age =age;
		this.name = name;
	}
	@Override
	public boolean equals(Object object) {
		if(object instanceof Member) {
			Member member = (Member)object;
			return member.name.equals(name) && (member.age==age);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	// 인스턴스가 달라도 나이와 이름이 동일하면 같은 것으로 취급
}
