package collection_programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class P18EntrySetInHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "India");
		hm.put(3, "Australia");
		hm.put(2, "Canada");
		hm.put(4, "China");
		hm.put(5, "Brazil");
		
		System.out.println("Original HashMap : "+hm);
		
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		System.out.println(entrySet);
		for(Entry<Integer,String> entry : entrySet)
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Entry :: "+key+" : "+value);
		}
	}

}
