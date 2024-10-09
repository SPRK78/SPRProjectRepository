package day3_aug22;

public class IfelseIf {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30; // highest of 3 numbers
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else
			if(b>a && b>c)
			{
				System.out.println("b is greater");
			}
			/*else
			{
				System.out.println("c is greater");
			}*/
		
		System.out.println("c is greater");

	}

}
