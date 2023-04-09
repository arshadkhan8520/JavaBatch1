package class11;

public class FindTheLargestNumberInArray {

	public static void main(String[] args) {
		
		// Find the largest number in Array
		
		int [] num = {12, 10, 15, 16, 18};
		
		int large=num[0];
		
		for (int i=0; i<num.length; i++) {
			
			if (num[i]>large) {
				large = num [i];
			}
			
		}
		System.out.println("The array largest number is : "+ large);

	}

}
