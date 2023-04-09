package class11;

public class Practice2DArrayInNestedLoop {

	public static void main(String[] args) {
		
		
		String [][]grades = new String[2][4];
		
		           // first row
		
				grades[0][0] = "Farhad";
				grades[0][1] = "John";
				grades[0][2] = "Smith";
				grades[0][3] = "Chris";
				
				// 2nd row
				
				grades[1][0] = "A";
				grades[1][1] = "B";
				grades[1][2] = "$C";
				grades[1][3] = "$D";
				
				System.out.println(grades[0][0]+ ": "+ grades[1][0]+ " "+ grades[0][3]+ ": "+grades[1][1]);

	}

}
