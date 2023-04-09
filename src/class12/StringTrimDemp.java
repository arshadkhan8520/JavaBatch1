package class12;

public class StringTrimDemp {

	public static void main(String[] args) {
		
		String name1 = "         Arshad";
		System.out.println(name1); // this one print spaces with Arshad
		
		// now I dont want to print the spaces will use the below method
		
		System.out.println(name1.trim());
		
		String demoTrimString = "This is trim demonstration";
		System.out.println(demoTrimString.trim());

	}

}
