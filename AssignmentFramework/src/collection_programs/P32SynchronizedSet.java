//How to create synchronized set?

package collection_programs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P32SynchronizedSet {

	public static void main(String[] args) {
		Set<Object> hs = new HashSet<>();
		hs.add("Uttar Pradesh");
		hs.add("Madhya Pradesh");
		hs.add("Andhra Pradesh");
		hs.add("Arunachal Pradesh");
		hs.add("Bihar");
		hs.add("Delhi");
		hs.add("Uttarakhand");
		
		Set<Object> syncSet = Collections.synchronizedSet(hs);
		System.out.println("Synchronized Set : "+syncSet);
	}

}
