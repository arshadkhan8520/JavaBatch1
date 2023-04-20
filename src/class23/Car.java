package src.class23;

import java.sql.SQLOutput;

public class Car {

    void start(){
        System.out.println("The car is starting by key");
    }
    void stop(){
        System.out.println("You should use brake to stop the car");
    }
}

class BMW extends Car{
    void start(){
        System.out.println("Use the button to start the car");

    }
}
class Tesla extends Car{
    void start(){
        System.out.println("Start the car with finger print button");
    }
    void stop(){
        System.out.println("Stop the car with sensors");
    }
}