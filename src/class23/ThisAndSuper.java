package src.class23;

public class ThisAndSuper {

    int num;
    ThisAndSuper(){
        this.num=num;
        System.out.println("I am the first constructor");
    }
    ThisAndSuper(int num){
        this();
        System.out.println("I am the second constructor");

    }
    public static void main(String[] args) {
        ThisAndSuper obj = new ThisAndSuper();
    }
}
