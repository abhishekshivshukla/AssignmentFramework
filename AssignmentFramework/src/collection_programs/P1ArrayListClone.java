package collection_programs;

import java.util.ArrayList;

public class P1ArrayListClone {

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
				System.out.println("Original Array :  "+arrList);
				//Clone the array
				Object clonedArr = arrList.clone();
				//print clonned array
				System.out.println("Clonned Array : "+clonedArr);
				
	}

}
