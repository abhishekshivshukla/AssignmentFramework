//How to get first key element from TreeMap (Sorted Map

package collection_programs;

import java.util.Map.Entry;
import java.util.TreeMap;

public class P29FirstKeyElementFromTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>(new P28AMyComparator());
		tm.put(1, "India");
		tm.put(3, "Australia");
		tm.put(2, "Canada");
		tm.put(4, "China");
		tm.put(5, "Brazil");		
		System.out.println("Original TreeMap : "+tm);
		
		Integer firstKey = tm.firstKey();
		System.out.println("First Key element : "+firstKey);
		Integer lastKey = tm.lastKey();
		System.out.println("Last Key element : "+lastKey);
		
		Entry<Integer, String> firstEntry = tm.firstEntry();
		System.out.println("First Entry : "+firstEntry);
		Entry<Integer, String> lastEntry = tm.lastEntry();
		System.out.println("Last Entry : "+lastEntry);		
	}
}
