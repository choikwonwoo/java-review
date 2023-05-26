package day12;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String pw = sc.nextLine();
		
		map.put("id", "pw");
		
		if(map.containsKey(id)) {
			if(map.get(id).equals(pw)) {
				System.out.println("로그인!");
			}else {System.out.println("실패!");}
		}else {System.out.println("실패!");}
		
	}
}
