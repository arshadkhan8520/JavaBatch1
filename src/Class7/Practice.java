package Class7;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		
		double number1 = input.nextDouble();
		System.out.println("Please enter the second number");
		double number2 = input.nextDouble();
		System.out.println("Please add one of these operators +, -, /, *");
		char operator = input.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println(number1+number2);
			break;
		
		case '-':
			System.out.println(number1+ " -" +number2+ "="+ (number1-number2));
			break;
		case '/':
			System.out.println(number1/number2);
			break;
		case '*':
			System.out.println(number1*number2);
			break;
			
		default:
            System.out.println("INVALID OPERATOR");
		}
		
		

	}

}
