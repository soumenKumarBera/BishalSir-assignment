package student_soumen_oop_assignment.qs12;

public class Circle implements Shape{

    private double redius;

    public Circle(double redius) {
        this.redius = redius;
    }


    @Override
    public void calculatingArea() {
        double result = Math.PI * (Math.pow(this.redius, 2));

        System.out.println("Circle Area: " + result);
    }
}
