package day5_aug26;

public class SingleArray {

	public static void main(String[] args) {
		// Version 1
		
		/*int a[]=new int[5]; // declare array
		
		a[0]=1; // add values
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;*/
		
		int a[]={1,2,3,4,5,6,7,10,11,12,13,14}; // add values directly in array
		
		System.out.println(a.length); // prints array length
		System.out.println(a[3]);
		
		for(int i=0; i<=a.length-1; i++) // for loop to print array values
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		for(int x:a) // enhanced for loop or for each loop to print array values
		{
			System.out.print(x);
			System.out.print(" ");
		}

	}

}
