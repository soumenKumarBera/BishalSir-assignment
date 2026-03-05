package student_soumen_oop_assignment.qs11;

public class Product {
    private long productId;
    private String name;
    private double priced;

    private static long generatedId = Math.round(Math.random() * 1000);


    public Product(int productId, String name, double priced) {
        this.productId = productId;
        this.name = name;
        this.priced = priced;
    }


    public Product(String name, double priced ) {
        this.productId = generatedId;
        this.name = name;
        this.priced = priced;

    }


    public void displayProduct(){
        System.out.println("Product Id: " + this.productId);
        System.out.println("Name      : " + this.name);
        System.out.println("Priced    : " + this.productId);
        System.out.println("---------------------------------------------");

    }



}
