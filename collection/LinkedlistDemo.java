package collection;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		LinkedList ll =new LinkedList();
		
		ll.add(88);
		ll.add(null);
		//ll.add(args);
		//ll.add(ll);
		ll.add("poooja");
		ll.add("pondicherry");
		
		System.out.println(ll);
		
		ll.poll();
		System.out.println(ll);
		
		

	}

}
