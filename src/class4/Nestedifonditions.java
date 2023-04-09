package class4;

public class Nestedifonditions {

	public static void main(String[] args) {
		
		int age =19;
		if (age<18) {
			System.out.println("You should have your father permission to work");
		} else {
			System.out.println("your are older than 18");
			if (age<64) {
				System.out.println("You're eligible to work");
			} else {
				System.out.println("Enjoy your life you need to rest");
				
			}
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		boolean diploma = true;
		double gpa = 3.5;
		
		if (diploma) {
			System.out.println("congratulation");
			if (gpa>=3.5) {
				System.out.println("You're eligible for scholarship");
			} else {
				System.out.println("You should study hard to be eligible for scholarship");
			}
		}else  {
			System.out.println("You need to get a degree");
		} 
		
		
		

	}

}
