package collection_programs;

import java.util.ArrayList;

import org.testng.Assert;

public class P2ArrayListContainsAll {

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
		boolean res = arrList.contains("Abhishek");
		System.out.println("Result : "+res);
		Object clonedArr = arrList.clone();
		//print clonned array
		System.out.println("Clonned Array : "+clonedArr);
		boolean contRes = arrList.containsAll(arrList);
		System.out.println("Contains all res : "+contRes);
		
		Assert.assertEquals(arrList, clonedArr);
		
	}

}
