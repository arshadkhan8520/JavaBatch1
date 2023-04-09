package src.reviewClass5;

public class Account {

    String userName;
    String password;
    double balance;
    String accountNumber;
    boolean isLoggedIn;

    public void login(String userLoggedInUserName, String userLoggedInPassword){
        if (userName.equals(userLoggedInUserName)&& password.equals(userLoggedInPassword)){
            System.out.println("Welcome to the Bank of America");
            isLoggedIn=true;
        }else{
            System.out.println("Your password or username is incorrect");
        }

    }

    public void userInfo(){
        if (isLoggedIn){
        System.out.println("Your account number is "+accountNumber+" and your balance is "+balance);

    }else{
            System.out.println("your credentials are incorrect please try again");
        }

        }


}
