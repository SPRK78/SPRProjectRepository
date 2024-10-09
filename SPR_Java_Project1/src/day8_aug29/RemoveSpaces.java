package day8_aug29;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String qwer=" Today is thursday";
		
		String qwer1="*Today %^is *&thursday$%$%&&";
		
		String nospace=qwer.replaceAll("\\s", ""); // built in method used to remove all 
		
		String nospace1=qwer1.replaceAll("[*%^*&$%$%&&]*", "");
		
		System.out.println(nospace);
		
		System.out.println(nospace1);

	}

}
