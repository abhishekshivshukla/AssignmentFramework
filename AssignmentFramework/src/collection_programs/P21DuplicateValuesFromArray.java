package collection_programs;

import java.util.TreeSet;

public class P21DuplicateValuesFromArray {

	public static void main(String[] args) {
		String arr[] = {"Abhishek","Kartikey","Abhishek","Kartikey"};
		for(String ele : arr)
		{
			System.out.println(ele);
		}
		System.out.println();
		
		TreeSet<String> treeSet = new TreeSet<String>();
		for(String ele : arr)
		{
			if(!treeSet.add(ele))
				System.out.println("Duplicate entry is : "+ele);
		}
		
	}

}
