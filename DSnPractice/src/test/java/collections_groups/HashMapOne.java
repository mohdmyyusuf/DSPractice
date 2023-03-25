package collections_groups;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapOne {
	
	/*
	 * The HashMap is a data structure, based on hashing, which allows you to store
	 * an object as a key-value pair, an advantage of using HashMap is that you can
	 * retrieve objects on constant time i.e. O(1) if you know the key.
	 * 
	
	 */
	
	HashMap<String, Integer> mymap = new HashMap<String, Integer>();
	public void addValues(String key, int value) {
	mymap.put(key, value);
	
	}
	
	public void diplayContent()
	{
		Iterator itr = mymap.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
