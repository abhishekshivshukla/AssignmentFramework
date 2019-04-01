package collection_programs;

import java.util.HashSet;

public class P12CopySetToHashSet {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add("Abhishek");
		hs.add(26.5);
		hs.add(89);
		hs.add("Ashutosh");
		hs.add("Shashank");
		
		System.out.println("Original Hash Set :  "+hs);
		
		HashSet<Object> hsNew = new HashSet<Object>(hs);
		System.out.println("Hash Set 1 : "+hsNew);
		
		HashSet<Object> hsNew2 = new HashSet<Object>();
		hsNew2.addAll(hsNew);
		System.out.println("Hash Set 2 : "+hsNew);
	
		Object clone = hs.clone();
		System.out.println("Hash Set 3 : "+clone);
	}

}
