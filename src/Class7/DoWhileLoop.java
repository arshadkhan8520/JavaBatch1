package Class7;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		// we want to have a program to print number from 1-10
		
		int num1 = 1;
		do {
			System.out.print(num1+ " ");
			num1++;
		}while (num1<=10);
		
        // this println break two line not printing both in one line
		System.out.println();
		
		int num2 = 10;
		while(num2>=1){
			
			System.out.print(num2+ " ");
			num2--;
		}

	}

}
