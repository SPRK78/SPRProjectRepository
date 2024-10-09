package day4_aug23;

public class TestLoop {

	public static void main(String[] args) {
		// Print "Yatzy!" if the dice number is 6
		
		int i=1;
		
		while(i<=10)
		{
			if(i==6)
			{
				System.out.println("Yatzy!");
				i++;
			}
			
			System.out.println(i);
			i++;
		}

	}

}
