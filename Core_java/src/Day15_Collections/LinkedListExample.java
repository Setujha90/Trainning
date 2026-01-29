package Day15_Collections;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		list.add("java");
		list.add("cpp");
		list.add("python");
		
		System.out.println("Frist element: "+list.get(0));
		
		list.set(1, "Javascript");
		list.remove("cpp");
		
		System.out.println("Updated List: "+list);
		
		

	}

}
