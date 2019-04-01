//How to get sorted sub-map from TreeMap?

package collection_programs;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

	public class P28SortedMapFromTreeMap extends P28AMyComparator {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>(new P28AMyComparator());
		tm.put(1, "India");
		tm.put(3, "Australia");
		tm.put(2, "Canada");
		tm.put(4, "China");
		tm.put(5, "Brazil");		
		System.out.println("Original TreeMap : "+tm);
		NavigableSet<Integer> descendingKeySet = tm.descendingKeySet();
		System.out.println(descendingKeySet);
		NavigableMap<Integer,String> descendingMap = tm.descendingMap();
		System.out.println(descendingMap);
		
		// Upper boundary only
		SortedMap<Integer, String> subMap1 = tm.subMap(2, 5); // gives 2,3,4 with this method RT- SortedMap only
		System.out.println("SubMap 1 : "+subMap1);
		// Both the boundaries
		NavigableMap<Integer,String> subMap2 = tm.subMap(2, true, 5, true); //gives 2,3,4,5 
		System.out.println("SubMap 2 : "+subMap2);
		// Neither upper nor lower boundary
		Map<Integer, String> subMap3 = tm.subMap(2, false, 5, false); // gives 3,4
		System.out.println("SubMap 3 : "+subMap3);
		// Only lower boundary
		SortedMap<Integer,String> subMap4 = tm.subMap(2, false, 5, true);
		System.out.println("SubMap 4 : "+subMap4);
		
		// Important : for subMap 2,3 and 4
		// RT can be anything (SortedMap, NavigableMap or Map
		//but for subMap 1 RT can only be SortedMap		
	}
}