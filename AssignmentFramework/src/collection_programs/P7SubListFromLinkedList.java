package collection_programs;

import java.util.LinkedList;
import java.util.List;

public class P7SubListFromLinkedList {

	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<Object>();
		
		ll.add("Abhishek");
		ll.add(25);
		ll.add(26.5);
		ll.add("Ashutosh");
		ll.add("Shashank");
		
		System.out.println("Linked List :  "+ll);
		
		List<Object> subList = ll.subList(1,3);
		System.out.println("Sub list from Linked List : "+subList);
		//it will retrieve only index 1 and 2 not 3
	}

}
