package src.class18;

public class Canada {
    public static void main(String[] args) {

        USA obj2 = new USA();
        System.out.println("Those values are from USA class to the Canada class in the same package");
       // System.out.println(obj2.capitalCity); This variable isnt accessable because it is declare as private in the USA class
        System.out.println(obj2.name);
        System.out.println(obj2.mainState);
        System.out.println(obj2.school);


    }
}
