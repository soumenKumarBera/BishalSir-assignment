package student_soumen_oop_assignment.qs2;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(){

    };

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calculateArea(){
        int result = length * width;
        System.out.println("RectangleArea: " + result);

    };

    public void calculatePerimeter(){
        int result = 2 *(length * width);
        System.out.println("RectanglePerimeter: " + result);

    }
}
