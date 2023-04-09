package reviewClass3;

public class DimensionalArrayPractice {

	public static void main(String[] args) {
		
		
		int [][] num1 = {
				
				{12, 34, 35, 78},
				{10, 12, 43, 25},
				{23, 24}
		};
		
		System.out.println("The row numbers are "+num1.length); // this will print the row numbers
		
		System.out.println("first row elements are "+num1[0].length);     //  This print the first row element count
		System.out.println("second row elements are "+num1[1].length);
		System.out.println("third row elements are "+num1[2].length);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		// Only print 78 and 43
		
		for  (int [] num:num1) {
			for  (int n:num) {
				if (n==43 || n==78) {
					System.out.println(n);
				}
			}
		}

	}

}
