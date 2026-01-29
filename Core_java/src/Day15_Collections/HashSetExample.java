package Day15_Collections;

import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set	ha = new HashSet(); // remove the dublicate element and insertion order not maintained
		ha.add("Setu");
		ha.add("Kumar");
		ha.add("Jha");
		ha.add(12);
		ha.add(null);
		ha.add(null);
		System.out.println("Hashset: "+ha);
		
		LinkedHashSet set = new LinkedHashSet();
		set.add("a");
		set.add(88);
		
		System.out.println(set);
		
		TreeSet s = new TreeSet();
		s.add("xyz"); //Treeset generic data store krta h means homogeneous data store krta h ek hi trh ka data, jo phle data daalenge ussi trh ka data aage bhi expect krega , dursa dene pe error dega
		s.add("avb");
//		s.add(99); //error
		
		System.out.println(s);
		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(); // create min heap
		p.offer(12);
		p.offer(45);
		p.offer(1);
		
		System.out.println(p); 
		
		
		HashMap map = new HashMap();
		map.put("key", "map");
		map.put(66, "xyz");
		map.put(2, "aaa");
		map.put(66, "abc"); // if we assigning the value to same key value reassign to it
		
		System.out.println(map);

	}

}
