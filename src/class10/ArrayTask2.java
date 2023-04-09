package class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		
		int [] ArrayNumbers = {12,23,34,45,56, 55, 50}; // size of array
		                     //0  1  2  3  4
		
		System.out.println(ArrayNumbers[3]);
		System.out.println("The size of array is  "+ArrayNumbers.length);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
	// Another way to print numbers
		
		for (int i=0; i<ArrayNumbers.length; i++) {
			System.out.print(ArrayNumbers[i]+" ");
			
			
			
			
				
			}
		     System.out.println();
		     for (int i=ArrayNumbers.length-1; i>=0; i--) {
		    	 System.out.print(ArrayNumbers[i]+ " ");
		}

	}

}
