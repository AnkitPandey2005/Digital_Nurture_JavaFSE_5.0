package Factory_Method_Pattern;

public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus is ready for passengers.");
    }

}