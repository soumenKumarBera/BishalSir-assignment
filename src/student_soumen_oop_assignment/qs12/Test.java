package student_soumen_oop_assignment.qs12;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,5);
        Circle circle = new Circle(10);

        calculatingArea(rectangle);
        calculatingArea(circle);
    }

     static void calculatingArea(Shape s){
        s.calculatingArea();
    }
}
