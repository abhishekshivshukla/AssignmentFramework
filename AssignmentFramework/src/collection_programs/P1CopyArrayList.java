package collection_programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class P1CopyArrayList {

	public static void main(String[] args) {
		
		//Create on array list
		ArrayList<Object> arrList = new ArrayList<Object>();
		//add elements to array
		arrList.add("Abhishek");
		arrList.add(25);
		arrList.add(26.5);
		arrList.add("Ashutosh");
		arrList.add("Shashank");
		//print the array list
		System.out.println("Original Array : "+arrList);
		//create any collection and use overloaded constructor
		LinkedList<Object> linkedList = new LinkedList<Object>(arrList);
		//print the linked list
		System.out.println("Copied Array : "+linkedList);		
	}
}
