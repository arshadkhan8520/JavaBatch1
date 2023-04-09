package reviewClass2;

import java.util.Scanner;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		// Let collect the first and last name from a customer.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please type your first name");
		String firstName=scan.next();
		
		System.out.println("Please type your last name");
		String lastName = scan.next();
		
		System.out.println("Hello! Your frist name is "+firstName+" and your last name is "+lastName);
		
		

	}

}
