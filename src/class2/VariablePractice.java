package class2;

public class VariablePractice {
	
	public static void main(String[]args) {
		
		// Declare a veriable then assign a value 12
		
		int n1;
		n1=12;
		System.out.println(n1);
		
		// We can create couple variable in the same time.
		int num1, num2, num3;
		num1=5;
		num2=10;
		num3=num1;
		
		System.out.println(num3);
		
		Boolean isTodayFriday;
		isTodayFriday=false ;
		
		Boolean isTodaySunday;
		isTodaySunday = isTodayFriday;
		
		Boolean isTodayMonday = true;
		
		
		String name = " Arshad";
		String greeting = "Hello";
		
		System.out.println(greeting +name);
		
		System.out.println("is today friday "+ isTodayFriday);
		
		/* to attach any value (int, String, char, boolean) ;to a string we use (+)->
		 * concatenation operator 
		 *
		 *
		 *Create a string variable shopping and assign the value "I want to buy"
		 *Declare int num and assign the value 10
		 *Create variable string count assign the value "apples"
		 *Conatenate all three variables make a correct sentences
		 *
		 */
		

		String shopping = "I want to buy ";
		int num;
		num=10;
		String count = " apples";
		
		System.out.println(shopping + num + count);
		
		
		
		
		
		
		
		
	}

}
