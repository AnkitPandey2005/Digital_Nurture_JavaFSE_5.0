package Singleton_Pattern;

public class Driver {

    public static void main(String[] args) {

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.display();

        if (config1 == config2) {
            System.out.println("Only one object is created.");
        } else {
            System.out.println("More than one object is created.");
        }
    }
}