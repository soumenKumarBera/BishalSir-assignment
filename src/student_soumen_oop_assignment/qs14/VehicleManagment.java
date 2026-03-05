package student_soumen_oop_assignment.qs14;

import java.sql.SQLOutput;

public class VehicleManagment {
    public static void main(String[] args) {
        Car car = new Car();
        Biike biike = new Biike();

        System.out.println("car Details");
        car.startVehicle();
        car.fuelType();

        System.out.println("Bike details");
        biike.startVehicle();;
        biike.startVehicle();
    }
}
