package class11;

public class ArrayPractice {

	public static void main(String[] args) {
		
		//Create an array of n a m e s and store all names of your group. Th e n print your n a m e from
		//that array. (use 2 different ways of creating an array).
		
		String [] names = new String [5];
		
		names [0] = "Ahmad";
		names [1] = "Ali";
		names [2] = "Khan";
		names [3] = "Jan";
		names [4] = "Mohamamd";
		
		System.out.println(names[1]);
		
		// Second way
		
		String [] names1= {"Arshad", "Ahmad", "Mohammad Ali"};
		System.out.println(names1[2]);
		
		// We can print all names by loop
		
		for (int i=0; i<names1.length; i++) {
			System.out.print(names1[i]+ ", ");
		}
		

		// Another way of Array in loop
		System.out.println();
		
		for (String n:names) {
			
		// if(n=="Ahmad") {    // if we only want to print Ahmad
			System.out.print(n+ " ");
			
			
			
				
			}
		}
		
		
		
	}


