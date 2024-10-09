package day11_sep4;


class A
{
	int a=100;
	void display1()
	{
		System.out.println(a);
	}
	
}

class B extends A
{
	int b=100;
	void display()
	{
		System.out.println(b);
	}
	
}

class C extends B
{
	int c=100;
	void display3()
	{
		System.out.println(c);
	}
	
}

public class SingleInheritance {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C objb = new C();
		objb.display();
		objb.display1();
		objb.display3();

	}*/

}
