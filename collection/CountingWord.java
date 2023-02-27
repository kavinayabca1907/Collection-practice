package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingWord {

	public static void main(String[] args) {
		
		String subjects="tamil english maths social tamil";
		HashMap<String,Integer> words=new HashMap<String,Integer>();
		
		String arr[]=subjects.split(" ");
		
		for(String s:arr) {
			if(words.containsKey(s)) {
				words.put(s, words.get(s)+1);
			}
			else {
				
				words.put(s,1);
			}
						
			
		}
		System.out.println(words);
		
		 Set<Map.Entry<String,Integer>> se=words.entrySet();
		 for(Map.Entry<String,Integer> e:se) {
			 if(e.getValue()>1) {
				 System.out.println(e.getKey() +" "+ e.getValue());
			 }
			 
		 }


	}

}
