package student_soumen_oop_assignment.qs19;

public class StudentObject {
    public static void main(String[] args) {
        Student s1 = new Student("roni", 89f);
        Student s2 = new Student(s1);

        s1.display();
        s2.display();

        //Modify studenDetails.....
        s1.name= "rohan";
        s1.marks = 90f;

        s1.display();
        s2.display();



    }
}
