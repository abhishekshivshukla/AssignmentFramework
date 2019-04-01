//How to reverse sorted keys in a TreeMap

package collection_programs;

import java.util.TreeMap;

public class P30ReverseSortedKeysInTreeMap {

	public static void main(String[] args) {				
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "India");
		tm.put(3, "Australia");
		tm.put(2, "Canada");
		tm.put(4, "China");
		tm.put(5, "Brazil");
		System.out.println("Original TreeMap : "+tm);
		TreeMap<Integer, String> tm1 = new TreeMap<>(new P30AMyComparator());
		tm1.putAll(tm);				
		System.out.println("Customized TreeMap : "+tm1);
	}
}
