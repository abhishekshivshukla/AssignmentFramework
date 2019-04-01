package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class P3ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Object> arrList = new ArrayList<Object>();
		//add elements to array
		arrList.add("Abhishek");
		arrList.add(25);
		arrList.add(26.5);
		arrList.add("Ashutosh");
		arrList.add("Shashank");
		//print the array list
		System.out.println("Original Array :  "+arrList);
		
		ArrayList<Object> arrList1 = new ArrayList<Object>();
		arrList1.addAll(arrList);
		System.out.println("New Array List : "+arrList1);
		
		ArrayList<Object> arrList2 = new ArrayList<Object>();
		Iterator<Object> itr=arrList.iterator();
		while(itr.hasNext())
		{
			Object ele = itr.next();
			arrList2.add(ele);
		}
		System.out.println("Array List using iterator : "+arrList2);
		
		
	}

}
