package student_soumen_oop_assignment.qs19;

public class Student {
     String name;
     float marks;

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(Student s){

        this.name = s.name;
        this.marks =s.marks;

    }

    public void display(){
        System.out.println("name: "+ this.name);
        System.out.println("Marks: " + this.marks);
        System.out.println("..................................................................");

    }
}
