package student_soumen_oop_assignment.qs2;

public class RectangleObject {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Rectangle rectangle2 = new Rectangle();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();



        rectangle2.setLength(10);
        rectangle2.setWidth(5);
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

    }
}
