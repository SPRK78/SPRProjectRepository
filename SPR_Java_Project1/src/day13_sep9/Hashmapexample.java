package day13_sep9;

import java.util.HashMap;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> HM = new HashMap <Integer,String>();
		
		HM.put(101, "Surya");
		HM.put(102, "Chandini");
		HM.put(103, "Jaswanth");
		HM.put(104, "Surya"); // duplicate value
		HM.put(104, "Sonu");
		HM.put(109, "Smitha");// duplicate key .. not to be printed print last value
		
		// print the values
		
		System.out.println(HM);
		
		// get all keys
		
		System.out.println(HM.get(101));
		
		// all the values
		
		System.out.println(HM.keySet());

	}

}
