package collection_programs;

import java.util.Collections;
import java.util.LinkedList;

public class P8ReverseLinkedListContent {

	public static void main(String[] args) {
		
		LinkedList<Object> ll = new LinkedList<Object>();		
		ll.add("Abhishek");
		ll.add(25);
		ll.add(26.5);
		ll.add("Ashutosh");
		ll.add("Shashank");		
		System.out.println("Linked List :  "+ll);
		Collections.reverse(ll);
		System.out.println(ll);
	}

}
