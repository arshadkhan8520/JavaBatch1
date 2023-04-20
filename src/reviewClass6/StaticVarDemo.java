package src.reviewClass6;

public class StaticVarDemo {
    //create a method that will take a string and return an array of words from that string.
    //Mehtod should be available only within same class.

    private static String [] createWordArray(String str){

        String[] array;
        array=str.split(" ");
        for (String ar:array){
            System.out.println(ar);
        }
        return array;

    }

    public static void main(String[] args) {
        String words = " This is java review class 19";
        System.out.println(createWordArray(words));
    }
}

