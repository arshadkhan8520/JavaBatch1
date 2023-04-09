package Class7;

import java.util.Scanner;

public class DowhileVsWhileloop {
	public static void main(String[]args) {
		
		// Lets create a program to let the user add number from 1-100 when the number get 17, he wins the lottery
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int LotteryWinNumber= 17;
		System.out.println("Please add any number between 1-100 to win your lottery");
		
		do {
			num=input.nextInt();
		}while (num !=LotteryWinNumber);
		System.out.println("Congratulation! You are the winner");
		
		// This printout break the line
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int num1 = 0;
		int lotterywinningnumber= 10;
		
		
		while (num1 != lotterywinningnumber) {
			System.out.println("Please add any number from 1-100 to win the lottery");
			num1=input.nextInt();
		
	}
		System.out.println("Congratulation you are the lucky winner");
		
	}
	}


