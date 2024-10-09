package day8_aug29;

public class SPR_PrimeNumber {

	public static void main(String[] args) {
		// Prime Number
		
		int num=20;
		
		
		if(num==0 || num==1)
		{
			System.out.println("Not a prime number");
		}
		else
			if(num==2 || num==3)
			{
				System.out.println("Prime Number");
			}
		
		for(int i=num-1;i>=2;i--)
		{
			if(num%i==0)
			{
				System.out.println("Not a prime number");
				break;
				
			}
			
			else if(num%i!=0)
			{
				System.out.println("Prime Number");
				break;
			}
			
		}
				
					
			
				
				
	}

	

}
