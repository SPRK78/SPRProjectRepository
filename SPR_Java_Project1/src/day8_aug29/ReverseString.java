package day8_aug29;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string
		
		String S="Excelr";
		
		String rev="";
		
		for(int i=S.length()-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
		}
		
		System.out.println(rev);

	}

}
