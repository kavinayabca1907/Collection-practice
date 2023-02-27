package collection2;

import java.util.ArrayList;
import java.util.Collections;



public class CollectionDemo {

	public static void main(String[] args) {
		Cars c1=new Cars("suzuki",500,200000);
		Cars c2=new Cars("Marthi",600,600000);
		Cars c3=new Cars("Audi",500,300000);
		
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		
		//Collections.sort(al);
		//System.out.println(al);
		
		Comparatordemo2 cd =new Comparatordemo2();
																																																																											
		Collections.sort(al,cd);
		System.out.println("After sorting using comparator:"+al);
		
		
		// TODO Auto-generated method stub

	}

}
