package collection;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Setdemo {
	
	public String toString() {
		return "pqr";
	}

	public static void main(String[] args) {
		
		Setdemo sd =new Setdemo();
		
		
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(200);
		ll.add(sd);
		
		
		System.out.println(ll);
		
		LinkedHashSet lhs =new LinkedHashSet(ll);
		System.out.println(lhs);
		
		
           LinkedHashSet hs =new LinkedHashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add('k');
		hs.add(40);
		hs.add(50);
		
		hs.add(20);
		
		System.out.println(hs.add(40));  
		
		System.out.println(hs);
		
		Object[] ob=lhs.toArray();
		for(Object o:ob) {
			
			System.out.println(o);
		}
		
		TreeSet ts=new TreeSet();
		
		ts.add("kavi");
		ts.add("gayu");
		ts.add("vino");
		ts.add("kavya");
		System.out.println(ts.headSet("vino"));
		
		System.out.println("TreeSet:"+ts);
 
	}

}
