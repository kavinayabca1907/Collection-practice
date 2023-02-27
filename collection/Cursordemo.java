package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import collection2.Cars;

public class Cursordemo {

	
	public static void main(String[] args) {
		
		 ArrayList names=new ArrayList();
		 
		 names.add("V");
		 names.add("jk");
		 names.add("hobi");
		 names.add("jimin");
		 names.add("rm");
		 
		
		 
		 Cars cu1 =new Cars("tata",400,5000000);
		 Cars cu2=new Cars("mahindra",800,3000000);
		 
		 names.add(cu1);
		 names.add(cu2);
		 
		 

		 System.out.println("Before:"+names);
		 ListIterator i =names.listIterator();
		 
		 for(Object name : names ) {
			 
			 if(name.equals(cu1)) {
				 names.set(6 ,"hello");
			 }
			 
		 }
		 System.out.println("After:"+names);
	
		 while(i.hasNext()) {
			 
			 if(i.equals(cu1)) {
				 
				i.set(7);
				 	 
			 }	 
			 
		 }
	//System.out.println("After:"+names);
	      

	} 


}
