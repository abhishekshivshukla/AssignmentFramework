package collection_programs;

import java.util.SortedSet;
import java.util.TreeSet;

public class P22GetSubSetFromSortedSet {

	public static void main(String[] args) {
		SortedSet<Integer> ts = new TreeSet<>();
		ts.add(5);
		ts.add(9);
		ts.add(6);
		ts.add(10);
		ts.add(0);
		ts.add(2);
		ts.add(1);
		
		SortedSet<Integer> subSet = ts.subSet(1,9 );
		System.out.println("SubSet from 5 to 2 : "+subSet);
	}

}
