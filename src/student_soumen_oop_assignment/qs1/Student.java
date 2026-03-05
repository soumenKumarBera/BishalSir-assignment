package student_soumen_oop_assignment.qs1;

public class Student {
    private String name;
    private int rolNo;
    private float marks;

    public Student(String name, int rolNo, float marks) {
        this.name = name;
        this.rolNo = rolNo;
        this.marks = marks;
    };

    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("RollNo: " + this.rolNo);
        System.out.println("Marks: " + this.marks);


    };


}
