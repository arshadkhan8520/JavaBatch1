package reviewClass3;

import java.util.Scanner;

public class ArrayPractice {
	
	public static void main (String[]args) {
		
		// create a program to ask the user to size the array and store their text.
		
		Scanner scan = new Scanner (System.in);
		
		String [] array;
		
		System.out.println("Please ente rthe size of elements that you want to store in array by number");
		int size=scan.nextInt();
		array=new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter your text");
			array[i]=scan.next();
			
		}
		
		System.out.println(array.length);
		
	
	}
	


}
