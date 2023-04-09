package class11;

public class ArrayLength {

	public static void main(String[] args) {
		
		String [] [] countries = {
				{"Afghanistan", "USA", "India", "Japan"},
				{"Tajikistan", "China", "German"},
				{"Canada", "Mixco", "Irland"}
		};
		
		System.out.println("The row numbers are: "+countries.length);
		System.out.println("The first row elements are: "+countries[0].length);
		System.out.println(countries[1].length); // 2nd row elements
		System.out.println(countries[2].length); // The third row elements
		
		// now print the array elements length as For Loop.
		
		for (int r=0; r<countries.length; r++) {
			
			for (int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+ ", ");
			}
		}
		
		// finding Array length in Enhanced Loop
		System.out.println(); // this is for breaking line
		System.out.println(">>>>>>>>>>>>>>> use for each loop the get 2D Array elemens>>>>>>>>>>>>>>>>"); // break two lines
		
		for  (String[] j:countries) {
			
			for (String c:j) {
				System.out.print(c+"=");
			}
		}

	}

}
