package src.class15;

public class Dogs {

    String breed;
    String size;
    String color;
    String age;

    public void bark(){
        System.out.println("buf buf buf");
    }
    public void sleep(){
        System.out.println("ZZZZZzzzzzzz");
    }
    public void eating() {
        // lets print this 5 times
        for (int i = 0; i <= 5; i++) {
            System.out.println("ach ach ach");
        }
    }
    public void look(){
        System.out.println("Hi I am "+breed+ " my color is "+color);
    }
}
