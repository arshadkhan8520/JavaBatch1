package class12;

public class StringContain {

	public static void main(String[] args) {
		
		//Check if String contains a sequence
		
		String password = "123abc#$@";
		System.out.println(password.contains("$")); // output will be true or false
		
		if (password.contains("#")) {
			System.out.println("Please remove # charactor is not allowed");
		}else {
			System.out.println("You have a strong password");
		}

	}

}
