package day3_aug22;

public class Assignment3 {

	public static void main(String[] args) {
		// find the smallest of 3 numbers
		
		int a=20, b=10, c=30;
		
		if(a<b || a<c)
		{
			System.out.println("a is lesser number");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is lesser number");
		}
		else
		{
			System.out.println("c is lesser number");
		}

	}

}
