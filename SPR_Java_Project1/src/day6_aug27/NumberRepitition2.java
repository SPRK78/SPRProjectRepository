package day6_aug27;

public class NumberRepitition2 {

	public static void main(String[] args) {
		// To print output in below sequence
		
		/*
		 0
		 10
		 010
		 1010
		 01010
		 */
		
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				
				{
					System.out.print((i+j)%2);
				}
				
			}
			System.out.println();
		}

	}

}
