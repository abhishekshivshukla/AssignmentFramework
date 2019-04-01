package collection_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P20RemoveDuplicateFromArray {

	public static void main(String[] args) {
		String arr[] = {"Abhishek","Kartikey","Abhishek","Kartikey"};
		for(String ele : arr)
		{
			System.out.println(ele);
		}
		System.out.println();
		List<String> list = Arrays.asList(arr);
		HashSet<String> set = new HashSet<String>(list);

		Object[] arr1 = set.toArray();
		System.out.println();
		for(Object ele : arr1)
		{
			System.out.println(ele);
		}
	}

}
