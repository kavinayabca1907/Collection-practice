package collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	public static void main(String[] args) {
		int [] arr= {5,3,10,29,7};
		
		for(int i: arr)
			System.out.println(i);
		
		Arrays.sort(arr);
		System.out.println("After sorting");
		
		for(int i: arr)
			System.out.println(i);
		
		String[] names= {"anu", "pooja", "makhi", "monish","kavin"};
		//System.out.println("Before sorting names");
		
		//for(String s: names)
			//System.out.println(s);
		
		//Arrays.sort(names);
		
		//System.out.println("After sorting names");
		
		//for(String s: names)
			//System.out.println(s);
		
		Comparator comp= new Comparatordemo();
		Arrays.sort(names,comp);
		
         System.out.println("***After compare method usage***");
		
		for(String S: names)
			System.out.println(S);
		
		

	}

}
