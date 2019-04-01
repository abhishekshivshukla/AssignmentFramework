package collection_programs;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class P33CreateSynchronizedMap {

	public static void main(String[] args) {
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(1, "India");
		tm.put(3, "Australia");
		tm.put(2, "Canada");
		tm.put(4, "China");
		tm.put(5, "Brazil");
		
		Map<Integer, String> syncMap = Collections.synchronizedMap(tm);
		System.out.println("Synchronized Map : "+syncMap);
	}

}
