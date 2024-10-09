package day8_aug29;

public class SPR_PrimeOrNot {

	public static void main(String[] args) {
		// Whether the given number is prime or not
		
		int num=8;
		boolean flag=false;
		
		
		if(num==0 || num==1)
		{
			
			flag=true;
		}
		else
			if(num==2 || num==3)
			{
				
				flag=false;
			}
		
		for(int i=num-1;i>=2;i--)
		{
			if(num%i==0)
			{
				flag=true;
				break;
				
			}
					
			
		}
		
		if(!flag)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}

	}

}
