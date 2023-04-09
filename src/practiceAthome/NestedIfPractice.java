package practiceAthome;

public class NestedIfPractice {

	public static void main(String[] args) {
		
		/*
		 * WRITE A PROGRAM THAT WILL PRINT WHETHER IT IS A WEEKEND OR WEEKDAY. IF ANY
		 * DAY FROM 1-5 → OUTPUT “IT IS A WEEKDAY”, ANYDAY FROM 6-7 → OUTPUT “IT IS A
		 * WEEKEND”, ANY OTHER DAY → OUTPUT “INVALID D
		 */
		
		int day =7;
		
		if (day>=1 && day<=5) {
			System.out.println("It is a Weekday");
		}else if (day>=6 && day<=7) {
			System.out.println("It is a Weekend");	
			
		}else {
			System.out.println("Invalid");
		}
		



	}

}
