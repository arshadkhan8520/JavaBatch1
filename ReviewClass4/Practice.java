package ReviewClass4;

public class Practice {
    public static void main(String[] args) {
        /*Accept username, password and confirm
        password and check following requirements:
        1. Username and Password cannot be empty, if
        so→ message=”Username and Password cannot
        be empty”.
        2. Password should be m i n i m u m 8 characters, if
        less → message=”Password is too short”.
        3. Password cannot contain username if so, →
        message=”Password cannot contain username”.
        4. Password should match confirmed password, if
        not → message=“Passwords do not match”. Only after all requirements met → message
        “Your username and password has been created”*/

        String userName="user";
        String password="123";
        String confirmPassword= "123";
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("UserName and Password cannot be empty");
        }else if (password.length()<=8){
            System.out.println("password is too short");
        }else if (password.contains(userName)){
            System.out.println("Password can not contain user name");
        }else if (password.equals(confirmPassword)){
            System.out.println("password do not match");
        }else{
            System.out.println("Your userName and Password has been created");
        }
    }
}
