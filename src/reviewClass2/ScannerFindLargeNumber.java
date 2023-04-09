package reviewClass2;

import java.util.Scanner;

public class ScannerFindLargeNumber {

	public static void main(String[] args) {
		
		// Lets collect three numbers from a user than create a program to find a largest number.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please add your first number");
		double num1 = scan.nextDouble();
		
		System.out.println("Please add your second number");
		double num2 = scan.nextDouble();
		
		System.out.println("Please add your third number");
		double num3 = scan.nextDouble();
		
		if  (num1>num2 && num1>num3) {
			System.out.println("The large number is "+num1);
			
		}else if (num2>num3) {
			System.out.println("The larger number is "+num2);
			
		}else {
			System.out.println("The largest number is "+num3);
		}
		
		

	}

}
