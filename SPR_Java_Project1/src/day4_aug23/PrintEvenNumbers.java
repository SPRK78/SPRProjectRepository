package day4_aug23;

public class PrintEvenNumbers {

	
	// print even numbers between 1 to 10 until 8
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				if(i==8)
				{
					break;
				}
				System.out.println(i);	
			}
			
		}
			
	}

}
