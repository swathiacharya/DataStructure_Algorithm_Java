package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListWithCollection {

	public static void main(String arg[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Kavya");
		ll.add("Swathi");
		ll.add("Anujna");
		ll.add("Karthik");
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		ll.add(2, "Megha");
		System.out.println();
		System.out.println(ll);

		
		ll.remove(2);
		System.out.println();
		System.out.println(ll);
		
		

		ll.remove("aaa");
		System.out.println();
		System.out.println(ll);
		
		
		String val = ll.get(1);
		System.out.println();
		System.out.print(val);
		
		
		ll.set(2, "sneha");
		System.out.println();
		System.out.println(ll);
	}
}
