package src.class19;

public class StaticVariables {

    static String staticInfo = "This is static variables info";
    String name ="nonstatic";

    void info(){
        System.out.println(staticInfo);
    }

    public static void main(String[] args) {
        System.out.println(staticInfo);
    }
}
