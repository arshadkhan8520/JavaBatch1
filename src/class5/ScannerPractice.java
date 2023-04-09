package class5;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[]args) {
		
		// Ask the user to tell his/her name 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please add your name");
		
		String name = scan.next();
		System.out.println("Your name is "+name);
		
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is need. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */
		
		System.out.println("Please tell us what amount of loan do you need add numbers");
		
		int loan = scan.nextInt();
		if (loan<200000) {
			System.out.println("Congratulation you are eligible for loan");
		}else {
			System.out.println("Sorry we can not loan you more then 200,000");
		}
			
		
	}

}
