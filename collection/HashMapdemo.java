package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class HashMapdemo {

	public static void main(String[] args) {
		
		HashMap hm =new HashMap();
		hm.put(1, "tamil");
		hm.put(2, "english");
		hm.put(3, "maths");
		hm.put(4, "science");
		hm.put(5, "social");
		
		System.out.println("hashmap:"+hm);
		
		Set s=hm.keySet();
		System.out.println("Set of keys:"+s);
		
		Collection c=hm.values();	
		System.out.println("list of values:"+c);
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map me=(Map)i.next();
			if (me.containsValue("maths")) {
				me.put(6,"history");
			     System.out.println(me);
			}
		}
		

	}

}
