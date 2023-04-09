package class11;

public class Practice2DArray {

	public static void main(String[] args) {
		
		// Lets create two rows and one row should has number string and second row should has fruit names.
		
		String [][]fruits = new String[2][3];
		
		// first row
		
		fruits[0][0] = "$5";
		fruits[0][1] = "$10";
		fruits[0][2] = "$15";
		
		// 2nd row
		
		fruits[1][0] = "Apple";
		fruits[1][1] = "Straberry";
		fruits[1][2] = "$Orange";
		
		System.out.println(fruits[1][0]+ " price is "+fruits[0][2]+ " and "+ fruits[1][1]+ " price is "+ fruits[0][0]);
		
		

	}

}
