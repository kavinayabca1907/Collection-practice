package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingChar {
	
	
	public static void main(String[] args) {
		
		String s = "handwritting";
		
		HashMap<Character,Integer> cm =new HashMap<Character, Integer>();
		System.out.println(cm);
		
		char [] ch=s.toCharArray();
		
		for(char c:ch) {
			if(cm.containsKey(c)) {
				cm.put(c, cm.get(c)+1);
			}
			else {
				cm.put(c, 1);
			}
		}
		
		System.out.println(cm);
		
		Set<Map.Entry<Character,Integer>> se=cm.entrySet();
		
		for(Map.Entry<Character, Integer> entry:se)
		{
			if(entry.getValue()==1)
				System.out.println(entry.getKey() + " "+entry.getValue());
		}
	}

}
