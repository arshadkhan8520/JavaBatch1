package ReviewClass4;

public class Demo1 {

    public static void main(String[] args) {

       /* Write a program that reads two people's first
        n a m e s and if they expecting boy or girl? Based
        on the input suggests a name for a baby:*/

        String mom = "Diana";
        String dad = "smith";
        String child= "boy";

        if (child.equalsIgnoreCase("girl")) {
            int middle=dad.length()/2;
            int middle2=mom.length()/2;
            System.out.println(mom.substring(0,middle2)+dad.substring(middle));
        }else{
            int middle1=dad.length()/2;
            int middle3=mom.length()/2;
            System.out.println(dad.substring(0,middle1)+mom.substring(middle3));
        }

    }
}
