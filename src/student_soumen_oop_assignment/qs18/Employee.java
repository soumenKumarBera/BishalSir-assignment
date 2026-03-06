package student_soumen_oop_assignment.qs18;

public class Employee {
    String name;

    static String companyName = "Google";

    public Employee(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Company Name: " + companyName);
        System.out.println(".........................................");
    }
}
