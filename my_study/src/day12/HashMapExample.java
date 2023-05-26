package day12;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		System.out.println(map.get("a"));
		
		Set<String> KeySet = map.keySet();
		Iterator<String> keyIter = KeySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
		}
		map.remove("a");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
		}
	map.clear();
	}
}
