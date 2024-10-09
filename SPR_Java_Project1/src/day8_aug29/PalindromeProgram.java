package day8_aug29;

public class PalindromeProgram {

	public static void main(String[] args) {
		// Palindrome Program
		
		String S="Malayalam"; // malayalam, radar
		
		String rev="";
		
		for(int i=S.length()-1;i>=0;i--) // loop to get values
		{
			rev=rev+S.charAt(i); // to store the values
		}
		
		System.out.println(rev);
		
		if(S.toLowerCase().equals(rev.toLowerCase())) // Condition
		{
			System.out.println("Palindrome"); // True - Statement1
		}
		
		else
		{
			System.out.println("Not a palindrome"); // False - Statement2
		}

	}

}
