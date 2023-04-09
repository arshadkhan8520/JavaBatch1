package class2;

public class Casting {

	public static void main(String[] args) {
		
		
		// Casting we add one type variable value to another type
		//Exp:
		
		int num1 =2;
		double num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		// how to down cast
		num1 = (int) num2;
		System.out.println(num1);
		
		// Widening casting (implicit/ Automatic) converting lower data type into higher
		
		int num3 = 10;
		
		float num4 = num3;
		System.out.println(num4);
		
		// Narrowinging casting (Explicit/Manual) converting higher data type into lower
		
		num3 = (int) num4;
		System.out.println(num3);
		

	}

}
