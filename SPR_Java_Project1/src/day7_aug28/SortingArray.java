package day7_aug28;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// Sorting of Array values program
		
		char s[]= {'R','H','L','A'};
		
		System.out.println(Arrays.toString(s)); // before sorting
		
		Arrays.sort(s); // In-built sorting method Ascending order
		
		System.out.println(Arrays.toString(s)); // After sorting
	}

}
