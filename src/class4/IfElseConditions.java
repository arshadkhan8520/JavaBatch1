package class4;

public class IfElseConditions {

	public static void main(String[] args) {
		
		double num1 = 100.10;
		double num2 = 15.12;
		
		if (num1 > num2) {
			
			System.out.println("Double value " +num1 +" is bigger than "+ num2);
			
		} else if (num1 <num2) {
			System.out.println("Double value "+ num2 + "is bigger "+ num1);
		}else {
			
			System.out.println(num1 + " is equal to " + num2);
		}
		
		System.out.println("............................................................");
		System.out.println("............................................................");
		
		// Write the week days in if condition
		
		int day=3;
		
		if (day == 1) {
			System.out.println("Today is Monday");
		}else if (day == 2) {
			System.out.println("Today is Tuesday");
		}else if (day == 3) {
			System.out.println("Today is Wedensday");
		}else if (day == 4) {
			System.out.println("Today is Thursday");
		}else if (day == 5) {
			System.out.println("Today is Friday");
		}else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("The day is invalid");
		}
		



	}

}
