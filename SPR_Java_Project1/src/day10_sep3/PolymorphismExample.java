package day10_sep3;

public class PolymorphismExample {

	
		
		int a=10, b=20;
		
		void Sum()
		{
			System.out.println(a+b);
		}
		
		void Sum(int x, int y)
		{
			System.out.println(x+y);
		}
		
		void Sum(int x, double y)
		{
			System.out.println(x+y);
		}
		
		void Sum(double x, int y)
		{
			System.out.println(x+y);
		}

	}


