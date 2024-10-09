package day6_aug27;

public class ObjectVariable {

	public static void main(String[] args) {
		// To find an element 50
		
		int a[]= {10,20,30,40,50,60,70,80,90};
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==50 || a[i]==100)
			{
				System.out.println("element found");
				break;
			}
			
		}
		
		System.out.println("element not found");
	}

}
