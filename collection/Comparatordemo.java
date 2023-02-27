package collection;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Comparatordemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		 String s1=(String)o1;
		 String s2=o2.toString();
		 
		 if(s1.length()>s2.length())
			 
			 return +9;
		 
		 else if(s1.length()<s2.length())
			 
			 return -7;
		 
		 else
			 
		     return 0;
	}
	
		 
		
	}


