package Factory_Method_Pattern;

public class VehicleFactory {

    public Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }

        if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        if (type.equalsIgnoreCase("Bus")) {
            return new Bus();
        }

        return null;
    }

}