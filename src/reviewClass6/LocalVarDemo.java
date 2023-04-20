package src.reviewClass6;

public class LocalVarDemo {

    public String reversString(String str){

        String newString ="";
        for (int i=str.length()-1; i>=0; i--){
            newString+=str.charAt(i);

        }
        return newString;

    }

}
class LocalDemoTester{
    public static void main(String[] args) {
        LocalVarDemo obj = new LocalVarDemo();
        System.out.println(obj.reversString("Hello"));
    }

}