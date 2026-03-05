package student_soumen_oop_assignment.qs4;

public class CarObject {
    public static void main(String[] args) {
        Car car = new Car("BMW","BMW 2 Series Gran Coupe 218 M Sport","45.30 Lakh");
        Car car2 = new Car("Lamborghini","Lamborghini Revuelto ","8.70 Crore");

        car.displaycarInfo();
        car2.displaycarInfo();
    }
}
