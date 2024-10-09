package day6_aug27;

public class CountOfValue {

	public static void main(String[] args) {
		// To print count of value 500 using for loop
		
		int count=0;
		
		int arr[]= {100,200,300,400,500,600,500,800,500};
		
		for(int i=0; i<=arr.length-1;i++)
					
		{
				
			if(arr[i]==500)
			//count=count+1;
				count++;
		}
		
		System.out.println(count);
		
		
		// To print count of value 500 using extended for loop
		
		int count1=0;
		
		int arr1[]= {100,200,300,400,500,600,500,800,500};
		
					
			for(int x:arr1)
		{
				if(x==500)
		
				count1++;
		}
		
		System.out.println(count1);

	}

}
