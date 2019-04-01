// How to create synchronized list?

package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P31SynchronizedList {

	public static void main(String[] args) {
		List<Object> lst = new ArrayList<>();
		lst.add("Uttar Pradesh");
		lst.add("Madhya Pradesh");
		lst.add("Andhra Pradesh");
		lst.add("Arunachal Pradesh");
		lst.add("Bihar");
		lst.add("Delhi");
		lst.add("Uttarakhand");
		
		List<Object> syncList = Collections.synchronizedList(lst);
		System.out.println("Synchronized List : "+syncList);
	}
}
