package collection2;

import java.util.Comparator;



public class Comparatordemo2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String p =o1.toString();
	    String q=o2.toString();
	    int result=p.compareTo(q);
		
		if(result>1) {
			return +6;
		}
		else if(result<-1) {
			return -8;
		}
		else {
		return 0;
		}
	}

}
