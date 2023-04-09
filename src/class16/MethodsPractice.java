package src.class16;

public class MethodsPractice {

    // print paramters which has 2 numbers

    public void compareNumbers(int num, int num1){

        if (num>num1){
            System.out.println(num+ " is greater than "+num1);
        } else if (num1>num){
            System.out.println(num+ " is greater thn "+num1);
        }else {
            System.out.println("is equal "+num1);
        }
    }
    public void evenOrOdd (int num){
        if (num%2==0 && num!=0){
            System.out.println("The number is even");
        } else if (num%2!=0) {
            System.out.println("The number is odd");

        }else{
            System.out.println("The number is zero");
        }
    }
}
