package class11;

public class ForLoopGetElements {

	public static void main(String[] args) {
		
		
		// Getting Array elements For Loop 
		
		int [][] numbers = {
				{12, 33, 44,55, 66},
				{10, 4, 7},
				{70, 80, 90, 100}

				};
		
		System.out.println(numbers.length); // print the row number which is 3
		System.out.println(numbers[2].length); // print the number of third row elements which is 4
		
		for (int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers.length; c++) {
				// print even numbers
				if (numbers[r][c]%2==0) {
					
					System.out.print(numbers[r][c]+ ", ");
					
				}
			}
		}
		
		System.out.println(); // seperate line 
		System.out.println(">>>>>>>>>>>>>>>> using for each loop >>>>>>>>>>>>>>>>>>>>>>>>");
		
		// using for each loop
		for (int [] num1:numbers) {
			
			for (int n:num1) {
				if (n%2!=0) {
					System.out.print(n+ ", ");
				}
			}
			
		}
				
		}

	}


