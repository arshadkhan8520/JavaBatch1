package src.reviewClass5;

public class AccountTesterOrBankApp {
    public static void main(String[] args) {
        Account arshadAccount=new Account();
        arshadAccount.accountNumber="A123";
        arshadAccount.userName="Arshad";
        arshadAccount.password="pass123";
        arshadAccount.balance=1000.10;

        arshadAccount.login("Arshad", "pass123");
        arshadAccount.userInfo();

    }


}
