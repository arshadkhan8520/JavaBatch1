package class13;

public class StringSubString {

	public static void main(String[] args) {
		
		// This method returns a new string that is a substring of this string
		
		String str = "Welcome to Happy World";
		System.out.print("Return Value :");
		System.out.println(str.substring(10));
		
		System.out.print("Return Value :");
		System.out.println(str.substring(10, 15));
		
		// This method returns a new string that is a substring that begins with the character at the specified
		// index and extends to the end of this string
		
		String str1 = "Welcome to Happy World";
		System.out.print("Return Value :");
		System.out.println(str1.substring(10));
		
		System.out.print("Return Value :");
		System.out.println(str1.substring(10, 15));
		
		// Create a string and print it in reverse order (Sunday >>>>yadnus)
		
		String str2 = "Sunday";
		System.out.print("Return Value :");
		System.out.println(str2.substring(5));
		

	}

}
