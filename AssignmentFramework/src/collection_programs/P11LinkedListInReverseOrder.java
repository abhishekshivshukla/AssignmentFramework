package collection_programs;

import java.util.Iterator;
import java.util.LinkedList;

public class P11LinkedListInReverseOrder {

	public static void main(String[] args) {

		LinkedList<Object> ll = new LinkedList<Object>();		
		ll.add("Abhishek");
		ll.add(25);
		ll.add(26.5);
		ll.add("Ashutosh");
		ll.add("Shashank");		
		System.out.println("Linked List :  "+ll);
		
		Iterator<Object> itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
