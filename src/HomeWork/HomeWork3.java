package HomeWork;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		Scanner Calc = new Scanner(System.in);
        int n1=10;
        int n2=12;
        int Answer;

        System.out.println("Enter the first number: ");
        n1 = Calc.nextInt();
        System.out.println("Enter the second number:" );
        n2 = Calc.nextInt();
        System.out.println("Select the order of operation: ");
        char operator = Calc.nextLine().charAt(0);


        if (operator == '+') {
            Answer = (n1 + n2);
            System.out.println("Answer:" + Answer);
            } 
        if (operator == '-') {
            Answer = (n1 - n2);
            System.out.println("Answer:" + Answer);
            } 
        if (operator == '*') {
            Answer = (n1 * n2);
            System.out.println("Answer:" + Answer);
            } 
        if (operator == '/') {
            Answer = (n1/n2);
            System.out.println("Answer:" + Answer);
            } 
        else {
            System.out.println("not implemented yet. Sorry!");
		
        }

	}
		
	}
		

