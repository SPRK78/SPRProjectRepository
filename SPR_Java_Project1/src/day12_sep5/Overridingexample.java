package day12_sep5;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 8.5;
	}
}

class Kotak extends Bank
{
	double roi()
	{
		return 9.9;
	}
}


public class Overridingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kotak KE = new Kotak();
		System.out.println(KE.roi());
		
		

	}

}
