package src.class19;

public class LocalVariables {

    public void addition(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void sub (){
        int num1 =10;
        int num2 =12;
        System.out.println(num1-num2);
    }
    String returnString (int num){
        return "This is string";
    }

    public static void main(String[] args) {
        LocalVariables locVariables = new LocalVariables();
        locVariables.addition(10,16);
        locVariables.sub();
        System.out.println(locVariables.returnString(1));
    }
}
