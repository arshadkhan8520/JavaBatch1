package class12;

public class StringIsEmptyDemo {

	public static void main(String[] args) {
		
		
		String userName = "";
		System.out.println(userName.isEmpty()); // output boolean true/false
		
		if (userName.isEmpty()) {
			System.out.println("Please add your username the box should not be empty");
		} else {
			System.out.println("your userName is correct");
		}
		
		// conCat() +
		
		String hello = "Hello ";
		String name = "My name is Arshad";
		System.out.println(hello+name); // one way to concatenate and this way is recommended 
		
		// another way to concatenate 
		System.out.println(hello.concat(name));
		

	}

}
