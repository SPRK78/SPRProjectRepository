package day7_aug28;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int okay=sc.nextInt();
		
		System.out.println("Entered number is "+okay);
		
		int okay1=sc.nextInt();
		
		System.out.println("Entered number is "+okay1);
		
		System.out.println("Sum = "+(okay+okay1));

	}

}
