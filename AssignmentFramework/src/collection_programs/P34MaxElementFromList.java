//How to get max element from the given list?

package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P34MaxElementFromList {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Uttar Pradesh");
		lst.add("Madhya Pradesh");
		lst.add("Andhra Pradesh");
		lst.add("Arunachal Pradesh");
		lst.add("Bihar");
		lst.add("Delhi");
		lst.add("Uttarakhand");		
		System.out.println("Indian State List : "+lst);		
		String max = Collections.max(lst); // gives as per alphabitical order
		String min = Collections.min(lst);
		System.out.println("Biggest Element : "+max);
		System.out.println("Smallest Element : "+min);		
		List<Integer> arrList = new ArrayList<>();
		arrList.add(285);
		arrList.add(699);
		arrList.add(899);
		arrList.add(897);
		arrList.add(1000);
		arrList.add(156);
		System.out.println("Number List : "+arrList);
		Integer maxNum = Collections.max(arrList);
		System.out.println("Biggest Number : "+maxNum);
		Integer minNum = Collections.min(arrList);
		System.out.println("Smallest Number : "+minNum);
		
		
	}

}
