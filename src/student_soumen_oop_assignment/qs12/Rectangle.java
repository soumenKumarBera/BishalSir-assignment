package student_soumen_oop_assignment.qs12;

public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculatingArea() {
        double result = this.length * this.width;
        System.out.println("Rectangle Area: "+ result);


    }
}
