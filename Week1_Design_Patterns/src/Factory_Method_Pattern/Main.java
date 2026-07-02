package Factory_Method_Pattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VehicleFactory factory = new VehicleFactory();

        System.out.println("Choose a Vehicle");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Vehicle vehicle = null;

        switch (choice) {

            case 1:
                vehicle = factory.getVehicle("Car");
                break;

            case 2:
                vehicle = factory.getVehicle("Bike");
                break;

            case 3:
                vehicle = factory.getVehicle("Bus");
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        vehicle.start();

        sc.close();
    }

}
