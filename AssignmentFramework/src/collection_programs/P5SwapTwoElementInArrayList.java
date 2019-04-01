package collection_programs;

import java.util.ArrayList;
import java.util.Collections;

public class P5SwapTwoElementInArrayList {

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
		
		Collections.swap(arrList, 0, 2);
		System.out.println(arrList);
	}

}
