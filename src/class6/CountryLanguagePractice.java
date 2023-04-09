package class6;

import java.util.Scanner;

public class CountryLanguagePractice {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please add your country name first letter should be capital to show you the language");
		String countryname = scan.next();
		
		switch (countryname) {
		
		case "United States":
			System.out.println("English");
			break;
			
		case "Afghanistan" :
			System.out.println("Pashto/Dari");
			break;
			
		case "Pakistan" :
			System.out.println("You are Speaking Urdu");
			break;
			
			default:
				System.out.println("Sorry the country is not in our list");
			
		}


	}

}
