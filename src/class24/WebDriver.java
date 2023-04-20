package src.class24;

public class WebDriver {
    void openWebsite() {
        System.out.println("Opening the website");
    }

    void closingWebsite() {
        System.out.println("Close the website");
    }

    void LoginWebsite() {
        System.out.println("Login to the website");
    }
}
class GoogleChrome extends WebDriver{

    void openWebsite() {
        System.out.println("Opening the google chrome");
    }

    void closingWebsite() {
        System.out.println("Close the google chrome");
    }

    void LoginWebsite() {
        System.out.println("Login to the google chrome");
    }
}

class FireFox extends WebDriver {

    void openWebsite() {
        System.out.println("Opening the Firefox");
    }

    void closingWebsite() {
        System.out.println("Close the Firefox");
    }

    void LoginWebsite() {
        System.out.println("Login the website in the Firefox");

    }
}