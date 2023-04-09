package class12;

public class StringStartWithDemo {

	public static void main(String[] args) {
		
		// this method use for the first letter in string 
		
		String s1 = "These methods are only for string objects";
		System.out.println(s1.startsWith("Th")); // true
		
		if (s1.startsWith("These")) {
			System.out.println("The subject is plural");
		}else {
			System.out.println("The subject is singular");
		}
		
		System.out.println(s1.endsWith("s"));

	}

}
