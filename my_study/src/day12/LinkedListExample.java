package day12;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i<1000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime =System.nanoTime();
		
		startTime = System.nanoTime();
		for (int i = 0; i<1000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime =System.nanoTime();
	}
	// 끝에서부터 순차적으로 추가 삭제하는 경우는 어레이리스트가 빠르지만 중간에 추가 삭제하는 경우는 링크 리스트가 빠르다.
}
