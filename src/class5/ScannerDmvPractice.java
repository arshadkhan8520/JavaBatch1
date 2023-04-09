package class5;

import java.util.Scanner;

public class ScannerDmvPractice {

	public static void main(String[] args) {
		
		/*
		 * // You are DMV representative and you need to ask customer their age. If they
		 * are 18 an older you will issue a drive license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		
		Scanner input = new Scanner(System.in);
		
         System.out.println("Please put your age");
		
		int age = input.nextInt();
		if(age>=18) {
			System.out.println("Congratulation you are eligible for license");
		}else{
			System.out.println("You are eligible for learner permit");
			
		}
		

	}

}
