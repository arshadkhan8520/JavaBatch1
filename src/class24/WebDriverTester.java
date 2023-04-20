package src.class24;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver Driver = new FireFox();

     //   Driver.openWebsite();
    //    Driver.closingWebsite();
       // Driver.closingWebsite();

        WebDriver [] driver = {new FireFox(), new GoogleChrome()};
        for (WebDriver driver1: driver){
            driver1.openWebsite();
            driver1.LoginWebsite();
            driver1.closingWebsite();
        }
    }
}
