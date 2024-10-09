package day8_aug29;

public class CountCharactersinString {

	public static void main(String[] args) {
		// Count characters in a string
		
		String str="Welcome to my World";
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
						
			if(str.charAt(i)!=' ')
			count++;
				
		}
		
		System.out.println(count);

	}

}
