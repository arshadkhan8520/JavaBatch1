package src.class23;

import sun.security.util.Length;

public class Practice {

    void area(double length, double wide){
        if (length==wide){
        System.out.println("The square area with length "+length+ " wide "+wide+ " is "+length*wide);

    }else{
            System.out.println("Rectangle area is "+length*wide);
        }
}
    void area(double length, double wide, double hight){
        System.out.println("the box area is "+length*wide*hight);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.area(4, 4);
        practice.area(4, 3);
        practice.area(4, 2, 5);
    }
}
