package day11_sep4;

public class Staticexample {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println(a);
	}
	
	void m2()
	{
		System.out.println(b);
	}
	
	void m3()
	{
		System.out.println(a);
		m1();
		System.out.println(b);
		m2();
	}
		

}
