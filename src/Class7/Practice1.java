package Class7;

public class Practice1 {
	
		public static void main(String []args) {
			
			/*
			 * Create a boolean variable workDay and assign true create int variable day and
			 * assign it to 1
			 */	
			//As long as it is workDay print “I need a day off” and increase day.
			//Once day is 6 or 7 print “I do not need a day off any more”
			
			boolean workDay = true;
			int day = 1;
			
			while (workDay==true) {
				System.out.println(" I need a day off");
				day++;
				
				if (day==6 || day==7) {
					System.out.println("I don't need day off");
					workDay=false;
				}
			}
			
		}

}
