package collection_programs;

import java.util.ArrayList;

public class P3ArrayListToArrayTwo {

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
		
		
		Object [] arrNew=arrList.toArray();
		for(Object obj1 : arrNew)
		{
			System.out.println(obj1);
		}
		
		Object arr[]=new Object[arrList.size()];
		for(int i=0; i<arrList.size(); i++)
		{
			Object eleObj = arrList.get(i);
			arr[i]=eleObj;
		}
		System.out.println();
		
		for(Object obj : arr)
		{
			System.out.println(obj);
		}
	}

}
