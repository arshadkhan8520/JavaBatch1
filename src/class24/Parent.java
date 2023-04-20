package src.class24;

public class Parent {

    Parent(){
        System.out.println("I am the constructor");
    }

    static void staticMethod(){
        System.out.println("I am static method");
    }
    void parentMethod(){
        System.out.println("I am father of my child");
    }
}
class Child extends Parent{
    static void staticmethod(){

    }
    void parentMethod(){
        System.out.println("I am child method");

    }

    public static void main(String[] args) {
        Child child=new Child();
        child.parentMethod();
    }
}
