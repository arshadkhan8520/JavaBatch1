package review;

public class ArithmeticOperatorsPractice {

	public static void main(String[] args) {
		
		// Create two variables 99 and 15 then divide the first variable on second and print the reminder.
		
		int number1 = 99;
		int number2 = 15;
		int reminder=number1%number2;
		System.out.println("The reminder is "+reminder);
		
		// or we can print as below
		System.out.println("The reminder is "+number1%number2);
		
		// Create program to let the user login, create variable user another one password
		
		String userName="Arshad";
		String password="123abc";
		
		 if (userName=="Arshad") {
			 System.out.println("your username is correct please enter your password");
			 if(password=="123abc") {
				 System.out.println("welcome to your account");
			 }else {
				 System.out.println("Invalid Password Try Again");
			 }
			 
		 }else {
			 System.out.println("Invalid username try again");
		 }



	}

}
