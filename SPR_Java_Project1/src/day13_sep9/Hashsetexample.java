package day13_sep9;

import java.util.HashSet;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet myset = new HashSet();
		
		myset.add(100);
		myset.add('R');
		myset.add(true);
		myset.add("Surya");
		myset.add(100);
		myset.add(10.5);
		myset.add(null);
		
		System.out.println(myset);
		
		myset.remove('R');
		
		System.out.println(myset);
		
		myset.add("Java");
		
		System.out.println(myset);

	}

}
