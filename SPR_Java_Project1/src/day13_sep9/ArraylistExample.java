package day13_sep9;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList mylist = new ArrayList(); // predefined class

		// adding values/data into arraylist
		
		mylist.add(100);
		mylist.add(true);
		mylist.add('R');
		mylist.add("Surya");
		mylist.add(10.58);
		mylist.add(null); // null
		mylist.add(100); // duplicate value
		
		//size of arraylist
		
		System.out.println(mylist.size());
		
		// fetch the vlaue
		
		System.out.println(mylist.get(3));
		
		// before insertion
		
		System.out.println(mylist);
		
		//insert a data
		
		mylist.add(1,"Mysore");
		
		// fetch all values
		
		System.out.println(mylist);
		
		// delete an object
		
		mylist.remove(4);
		
		System.out.println(mylist);
		
		//modify
		
		mylist.set(1, "Java");
		System.out.println(mylist);
		
		// remove all
		
		mylist.clear();
		System.out.println(mylist);
		
	}

}
