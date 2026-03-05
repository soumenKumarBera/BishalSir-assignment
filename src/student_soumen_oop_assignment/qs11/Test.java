package student_soumen_oop_assignment.qs11;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(5,"chips", 5);
        Product p2 = new Product(6,"momo", 50);

        Product p3 = new Product("dairy milk", 250);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

    }
}
