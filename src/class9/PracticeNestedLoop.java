package class9;

public class PracticeNestedLoop {

	public static void main(String[] args) {
		
		// print below numbers
		//5 5 5 5
		//4 4 4
		//3 3
		//2
		
		int num =5;
		
		for(int i=5; i>=1; i--) {
			for (int a = 1; a<=i; a++) {
				System.out.print(num+ " ");
			}
			num--;
			System.out.println();
		}
		

	}

}
