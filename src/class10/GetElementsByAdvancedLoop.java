package class10;

public class GetElementsByAdvancedLoop {

	public static void main(String[] args) {
		
		
		int [] ArrayNumbers = {23,24,25,26,27};
		// We want to print the array all elements use the advanced loop
		
		for (int num:ArrayNumbers) {
			System.out.print(num+ " ");
		}
		
		System.out.println();
		String [] names = {"Ahmad", "Ali", "Khan", "Jan"};
		
		for (int i =0; i<names.length; i++) {
			System.out.print(names[i]+ " ");
			
			// Another way
		}
		System.out.println();
		for (String a:names) {
			System.out.print(a+ " ");
		}
		

	}

}
