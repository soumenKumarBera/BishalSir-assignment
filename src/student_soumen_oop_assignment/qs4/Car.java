package student_soumen_oop_assignment.qs4;

public class Car {
    private String brand;
    private String model;
    private String price;

    public Car(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displaycarInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

        System.out.println(".........................................................");


    }
}
