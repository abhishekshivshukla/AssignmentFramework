package collection_programs;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P27EntrySetFromTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "India");
		tm.put(3, "Australia");
		tm.put(2, "Canada");
		tm.put(4, "China");
		tm.put(5, "Brazil");		
		System.out.println("Original TreeMap : "+tm);
		
		Set<Entry<Integer, String>> entrySet = tm.entrySet();
		
		for(Entry<Integer,String> entry: entrySet)
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" : "+value);
		}
	}

}
