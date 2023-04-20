package src.class22;

public class Child extends Parent {

    String greeting = "Hello I am child class";

    public void printGreeting(){
        System.out.println(this.greeting);
        System.out.println(super.greeting);


    }


}
