package Singleton_Pattern;

public class AppConfig {

    private static AppConfig instance;

    private AppConfig() {
        System.out.println("AppConfig object created.");
    }

    public static AppConfig getInstance() {

        if (instance == null) {
            instance = new AppConfig();
        }

        return instance;
    }

    public void display() {
        System.out.println("Application configuration loaded.");
    }
}
