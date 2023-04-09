package src.class15.phoneDemo;

public class PhoneObject {
    public static void main(String[] args) {

        MobilePhone iphone = new MobilePhone();

        iphone.model= "iphone 12";
        iphone.price = 999;
        iphone.size = 6.4;
        iphone.make= "Apple";
        iphone.color="Black";
        iphone.phoneDetails();

        MobilePhone samsung = new MobilePhone();

        samsung.model = "Galaxy 14";
        samsung.price = 1000;
        samsung.make  = "samsung";
        samsung.color= "Silver";
        samsung.size = 7.3;
        samsung.phoneDetails();


    }



}
