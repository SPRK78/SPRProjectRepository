package day7_aug28;

public class StringMethodsExample {

	public static void main(String[] args) {
		// String Methods
		
		String A = "Yes";
		String B = "Holiday";
		String C = "Tommorow";
		
		// String length method
		
		System.out.println(A.length());
		System.out.println("Surya".length());
		
		// Concat method
		
		System.out.println(A+B);
		System.out.println(A.concat(B));
		System.out.println(A.concat(B).concat(C));
		System.out.println("HelloWorld".concat(C));
		
		// trim
		
		System.out.println(A.trim());
		
		// charAT
		
		System.out.println(B.charAt(3));
		
		// contains
		
		System.out.println(B.contains("li"));
		
		// touppercase
		
		System.out.println(C.toUpperCase());
		
		// tolowercase
		
		System.out.println(C.toLowerCase());
		
		// Replace
		
		System.out.println(A.replace('Y', 'H'));
		
		// equals - equalsignorecase
		
		System.out.println(A.equals(C));
		System.out.println(A.equals("YES"));
		System.out.println(A.equalsIgnoreCase("YES"));
		
		// Substring
		
		System.out.println(B.substring(2,3));
		

	}

}
