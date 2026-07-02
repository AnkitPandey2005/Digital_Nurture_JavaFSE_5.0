package Factory_Method_Pattern;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is ready to drive.");
    }

}
