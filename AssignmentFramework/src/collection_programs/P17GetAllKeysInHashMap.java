package collection_programs;

import java.util.HashMap;
import java.util.Set;

public class P17GetAllKeysInHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "India");
		hm.put(3, "Australia");
		hm.put(2, "Canada");
		hm.put(4, "China");
		hm.put(5, "Brazil");
		
		System.out.println("Original HashMap : "+hm);
		
		Set<Integer> keySet = hm.keySet();
		System.out.println("Key Set : "+keySet);
	}

}
