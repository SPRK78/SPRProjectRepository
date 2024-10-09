package day2_aug21;

public class SPR_Operators {

	public static void main(String[] args) {
		
		//int a=100;
		//int b=200;
		
		// Arithmetic Operators
		
		/*System.out.println("Value of a+b " + (a+b));
		System.out.println("Value of a-b " + (a-b));
		System.out.println("Value of a*b " + (a*b));
		System.out.println("Value of a/b " + (a/b));
		System.out.println("Value of a%b " + (a%b));*/
		
		// Relational Operators - O/P will be boolean true or false
		
		/*System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a=b);*/
		
		//logical operators
		
		/*boolean b1=false;
		boolean b2=true;
		
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		System.out.println(!b1);
		System.out.println(!b2);*/
		
		// Increment or decrement operators
		
		/*int s=10;
		
		System.out.println(s); // before increment
		s++; //s+1
		System.out.println(s); // after increment
		s--; //s-1
		System.out.println(s); // after decrement
		
		System.out.println();
		System.out.println();*/
		
		// Conditional/ternary operators
		
		int e=(200!=200) ? 250:400;
		
		System.out.println("value="+e);
		
		int person_age=18;
		
		String criteria=(person_age>=18) ? "Eligible":"Not Eligible";
		
		System.out.println("Criteria="+criteria);
		
		String Color="red";
		
		String Flower=(Color=="red") ? "rose":"not rose";
		
		System.out.println("Flower="+Flower);
		
		// swap of 2 numbers using 3rd variable (temp)
		
		/*int a=10;
		int b=20;
		
		System.out.println("before swapping");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		
		int temp;
		
		temp=b;
		b=a;
		a=temp;
		
		System.out.println();
		System.out.println("after swapping");
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);*/
		
		
		// swap 2 numbers without using 3rd variable (+-- theory)
		
		/*int x=10, y=30;
		
		System.out.println("before swapping");
		System.out.println("Value of x="+x);
		System.out.println("Value of y="+y);
		
		x=x+y; //40
		y=x-y; //10
		x=x-y; //30
		System.out.println();
		System.out.println("after swapping");
		System.out.println("Value of x="+x);
		System.out.println("Value of y="+y);*/
		
		
		

	}

}
