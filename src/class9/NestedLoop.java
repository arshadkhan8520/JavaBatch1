package class9;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int r=1; r<=3; r++) { //its called outer loop
			System.out.println();
			for (int c=1; c<=3; c++) {
				System.out.print(r+" ");
				
				
				
			}
			
		}
		
		for (int i=1; i<=3; i++) {
			System.out.println();
			System.out.print("I am outer loop");
			
			for  (int j=1; j<=2; j++) {
				System.out.println();
				System.out.print("I am inner loop");
				
			}
			
		}
		System.out.println();
	
		for (int i=1; i<=5; i++) { //outer loop
			
			for (int j=1; j<=i; j++) { // inner loop
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=5; i>=1; i--) { 
			
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}

}
