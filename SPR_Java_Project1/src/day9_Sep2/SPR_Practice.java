package day9_Sep2;

public class SPR_Practice {

	public static void main(String[] args) {
		
		// Highest of 2 numbers
		
		int a=30, b=20;
		
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
				
		
		// Highest of 3 numbers
		
		int d=100, e=50, f=150;
		
		if(d>e && d>f)
		{
			System.out.println("d is greater");
		}
		else if(e>d && e>f)
		{
			System.out.println("e is greater");
		}
		else
		{
			System.out.println("f is greater");
		}
			
		
		// To print a triangle using *
		
		// Print numbers from 1 to 10 using for and while loop
		
		for(int g=1; g<=10; g++)
		{
			System.out.print(g+" ");
		}
		
		System.out.println();
		
		int h=1;
		while(h<=10)
		{
			System.out.print(h+" ");
			h++;
		}
		
		System.out.println();
		
		int i=1;
		
		do
		{
			System.out.print(i+" ");
			i++;
		}
		while(i<=10);
		
		System.out.println();
			
		// Print multiplication table of 7
		
		int num=22;
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(num+"*"+j+"="+(num*j));
		}
		
		System.out.println();
		
		// Print even numbers between 1 to 10 until 8
		
		for(int k=1; k<=10; k++)
		{
			if(k%2==0)
			{
				if(k>8)
				{
					break;
				}
				System.out.print(k+" ");
			}
				
		}
		
		System.out.println();
		
		// To print all values of 2 dimensional array
		
		int[][] spr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.println(spr.length);
		
		for(int l=0;l<=spr.length-1;l++)
		{
			for(int m=0;m<=spr.length-1;m++)
			{
				System.out.print(spr[l][m]+" ");
			}
		}
		
		
		// To add values of an array
		
		// To print count of value 500 using for loop
		
		// To print output in below sequence
		
		/*
		 1
		 12
		 123
		 1234
		 12345
		 */
		// To print output in below sequence
		
		/*
		 0
		 10
		 010
		 1010
		 01010
		 */
		
		// To find an element 50 in an array
		
		// Sorting of Array values program
		
		// Scanner Program to input values in run time
		
		// String methods
		
		// Program to count characters in a string
		
		// Program to print Palindrome
		
		// Program to reverse a string
		
		// Program to remove spaces inside a lengthy string 
		
		 
		


	}

}
