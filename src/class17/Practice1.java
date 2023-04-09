package src.class17;

public class Practice1 {

    void creatEmail(String firstName, String lastName){
        System.out.println(firstName+"."+lastName+"@gmail.com");
    }

    // write a method to return value is prime or not
    public void isPrime(int num){
        if (num%num==0 && num%2!=0){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }


}
