package class6;

import java.util.Scanner;

public class FindLargeNumber {

	public static void main(String[] args) {
		
		double num1 = 16.5;
		double num2 = 15.34;
		double num3 = 25.25;
		
		if (num1>num2 && num2>num3) {
			System.out.println("The largest number is "+num1);
		}else if(num2>num3) {
			System.out.println("The largest number is "+num2);
			
		}else {
			System.out.println("The largest number is "+num3);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		// Program to find the largest number among three numbers using nested if provided by a user
		// (number must be distinct)
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please add three different number to find the largest number");
		int number1=input.nextInt();
		System.out.println("Please add number 2");
		int number2 = input.nextInt();
		System.out.println("Please add number 3");
		int number3 = input.nextInt();
		
		if (number1>number2) {
			if(number2>number3) {
				System.out.println("The largest number "+number1);
			}
			
			}else if (number2>number3) {
				System.out.println("The largest number "+number2);
			}else {
				System.out.println("The largest number is "+number3);
				
		}


	}
	

}
