package HomeWork;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please add your number");
		String result1 = scan.next();
		int nextnum=scan.nextInt();
		
		
		int number1 = 15;
		int number2 = 100;
		int result = 100/15;
		System.out.println(result);
		
		int num = 15;
		int num1 = 100;
		int result2 = 100*15;
		System.out.println(result);
		;
		
		System.out.println("Please enter first number");
		int firstNumber=scan.nextInt();
		System.out.println("Please enter second number");
		int secondNumber=scan.nextInt();
		if (firstNumber>secondNumber) {
		System.out.println(firstNumber+" is larger");
		}else if (secondNumber>firstNumber){
		System.out.println(secondNumber+" is larger");
		}else {
		System.out.println("Numbers are equal");

		}

	}

}
