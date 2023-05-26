package day12;

import java.util.*;

public class ArrayListExmaple {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("자바");
		list.add(1,"자ㅏ자");
		
		int size = list.size();
		
		String st = list.get(1);
		
		for(String lis : list) {
			System.out.println(lis);
		}
		list.remove(2);
		list.clear();
	}
}
