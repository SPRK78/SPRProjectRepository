package day4_aug23;

public class LoopingPrograms {

	public static void main(String[] args) {
		
		// Print numbers from 1 to 10
		
		int i=1; // initialization
		
		while(i<=10) // Condition
		{
			System.out.println("while "+i); // Print output 
			i++; // Increment
		}
		
		int j=1;
		
		do
		{
			System.out.println("dowhile "+j);
			j++;
		}
		
		while(j<=10);
		
		for(int k=1; k<=10; k++)
		{
			System.out.println("for "+k);
		}

	}

}
