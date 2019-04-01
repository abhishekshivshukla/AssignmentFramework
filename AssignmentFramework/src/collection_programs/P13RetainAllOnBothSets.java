package collection_programs;

import java.util.HashSet;

public class P13RetainAllOnBothSets {

	public static void main(String[] args) {
		
		HashSet<Object> hs1 = new HashSet<Object>();		
		hs1.add("Abhishek");
		hs1.add(26.5);
		hs1.add(89);
		hs1.add("Ashutosh");
		hs1.add("Shashank");		
		System.out.println("Original Hash Set :  "+hs1);
		
		HashSet<Object> hs2 = new HashSet<Object>();		
		hs2.add("Abhishek");
		hs2.add("Alok");
		hs2.add("Kartikey");
		hs2.add("Ashutosh");
		hs2.add("Shashank");		
		System.out.println("Original Hash Set :  "+hs2);
		
		hs1.retainAll(hs2);
		
		System.out.println("Retained elements : "+hs1);
		
		
	}

}
