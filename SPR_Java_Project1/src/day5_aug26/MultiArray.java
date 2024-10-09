package day5_aug26;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]numarray= {{1,2,3,4},{5,6,7,8},{9,0,5,3}};
		
		System.out.println("number of rows are "+ numarray.length+ " "+"number of columns are "+ numarray[0].length);
		System.out.println("Total number array values are "+ numarray.length*numarray[0].length);
		
		System.out.println(numarray[1][1]); // to print particular value of array
		
		// To print all values of 2 dimensional array
		
		for(int r=0; r<=numarray.length-1; r++)          // For loop to print 2 dimensional array values
		{
			for(int c=0; c<=numarray[r].length-1; c++ )
			{
				System.out.print(numarray[r][c]);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
		for(int arr[]:numarray) // Enhanced for loop to print 2 dimensional array values
		{
			for(int x:arr) 
			{
				System.out.print(x);
				System.out.print(" ");
			}
			
				System.out.println();
		}
		

	}

}
